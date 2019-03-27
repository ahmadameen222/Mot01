package com.motivation.dell.moneymotivation01;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.motivation.dell.moneymotivation01.data.QuoteData;
import com.motivation.dell.moneymotivation01.data.QuoteListAsyncResponse;
import com.motivation.dell.moneymotivation01.data.QuoteViewPagerAdapter;
import com.motivation.dell.moneymotivation01.model.Quote;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private FlipperLayout flipperLayout;
    private QuoteViewPagerAdapter quoteViewPagerAdapter;
    private ViewPager viewPager;
    public static int c=0;
    private LinearLayout howto_layout;
    private ImageView image_view;
    public static PublisherInterstitialAd mPublisherInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-6081186777692750~9784125877");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId("/6499/example/interstitial");
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());

        quoteViewPagerAdapter = new QuoteViewPagerAdapter(getSupportFragmentManager(), getFragments());
        viewPager = findViewById(R.id.viewPager1);
        viewPager.setAdapter(quoteViewPagerAdapter);


        mPublisherInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
            }

        });
        /*flipperLayout = (FlipperLayout) findViewById(R.id.flipper);
        setLayout();
        */// flipperLayout.setVisibility(View.VISIBLE);
        image_view = (ImageView)findViewById(R.id.image_view);
        image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, HowToListActivity.class);
                startActivity(i);

                if(c<=4){
                    c++;
                }else{
                    c=0;
                    // show add here
                    if (mPublisherInterstitialAd.isLoaded()) {
                        mPublisherInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                }


            }
        });

    }

    private List<Fragment> getFragments() {
        final List<Fragment> fragmentList = new ArrayList<>();

        new QuoteData().getQuotes(new QuoteListAsyncResponse() {
            @Override
            public void processFinished(ArrayList<Quote> quotes) {
                for (int i = 0; i < quotes.size(); i++) {
                    QuoteFragment quoteFragment = new QuoteFragment().newInstance(quotes.get(i).Quote, quotes.get(i).Author);
                    fragmentList.add(quoteFragment);
                }
                quoteViewPagerAdapter.notifyDataSetChanged();
            }
        });

        return fragmentList;
    }




}
