package com.motivation.dell.moneymotivation01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import static com.motivation.dell.moneymotivation01.MainActivity.c;
import static com.motivation.dell.moneymotivation01.MainActivity.mPublisherInterstitialAd;

public class HowToDetailsActivity extends AppCompatActivity implements RewardedVideoAdListener {
    Button r_btn;
    TextView n_tv;
    private Bundle extras;
    private String title;
    private RewardedVideoAd mRewardedVideoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_details);

        // MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        // Use an activity context to get the rewarded video instance.
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);

        loadRewardedVideoAd();

        extras = getIntent().getExtras();
        title = extras.getString("Title");




        if (title.equals("Fiverr"))
        {

            c++;

            setContentView(R.layout.fiverr_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.fiverr1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


            r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });


        }

        else if (title.equals("Freelancing"))
        {


            c++;

            setContentView(R.layout.freelancing_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.freelancing1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


          /*  r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/




        }

        else if (title.equals("YouTube"))

        {

            c++;

            setContentView(R.layout.youtube_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.youtube1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


           /* r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }

        else if (title.equals("Create and Sell How-To Courses"))

        {

            c++;

            setContentView(R.layout.how_to_cources_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.how_to_cources1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


           /* r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });
*/
        }

        else if (title.equals("Blogger"))

        {

            c++;

            setContentView(R.layout.blogger_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.blogger1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }

/*
            r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }

        else if (title.equals("Wordpress"))

        {

            c++;

            setContentView(R.layout.wordpress_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.wordpress1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


            r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });

        }

        else if (title.equals("Affiliate Marketing"))

        {


            c++;
            setContentView(R.layout.affliate_marketing_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.affliate_marketing1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


            r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });

        }

        else if (title.equals("Graphics Design"))

        {


            setContentView(R.layout.graphic_designing_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.graphic_designing1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


          /*  r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }


        else if (title.equals("Online tutor"))

        {


            setContentView(R.layout.online_tutor_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.online_tutor1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


          /*  r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }


        else if (title.equals("Data entry"))

        {


            c++;
            setContentView(R.layout.data_entry_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.data_entry1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


          /*  r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }


        else if (title.equals("E-commerce"))


        {

            c++;

            setContentView(R.layout.e_commerce_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.e_commerce1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


            /*r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }


        else if (title.equals("Develop Apps"))


        {


            setContentView(R.layout.develop_apps_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.develop_apps1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


           /* r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }

        else if (title.equals("Invest in YourSelf!"))


        {

            c++;

            setContentView(R.layout.invest_in_yourself_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.invest_in_yourself1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


           /* r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }

        else if (title.equals("Drive For Uber"))

        {

            c++;

            setContentView(R.layout.uber_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.uber1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


          /*  r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }


        else if (title.equals("Develop Courses On Udemy"))

        {

            c++;

            setContentView(R.layout.udemy_layout);


            n_tv = (TextView) findViewById(R.id.n_tv);
            n_tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c++;

                    setContentView(R.layout.udemy1_layout);
                }
            });

            if (c <= 4) {
                c++;
            } else {
                c = 0;
                // show add here
                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }


          /*  r_btn = (Button) findViewById(R.id.f_r_ad_btn);
            r_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (mRewardedVideoAd.isLoaded()) {
                        mRewardedVideoAd.show();
                    }

                }
            });*/

        }


        else {

//            setContentView(R.layout.freelancing_layout);

        }

    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

        if (title.equals("Fiverr")) {
            setContentView(R.layout.fiverr_prem_layout);
        }

    }

    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3940256099942544/5224354917",
                new AdRequest.Builder().build());
    }

    @Override
    public void onRewardedVideoAdClosed() {
        // Load the next rewarded video ad.
        loadRewardedVideoAd();
    }



}

