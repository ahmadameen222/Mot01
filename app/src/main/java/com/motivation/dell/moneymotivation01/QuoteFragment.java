package com.motivation.dell.moneymotivation01;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class QuoteFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_quote, container, false);

        TextView quoteText = v.findViewById(R.id.quoteText);
        TextView byAuthor = v.findViewById(R.id.byAuthor);
        CardView cardView = v.findViewById(R.id.cardView);
        //ImageView filledHeart = v.findViewById(R.id.heartunfilled);

        int colors [] = new int[] {R.color.purple, R.color.gray, R.color.Gold, R.color.Pink, R.color.Orange, R.color.LightSalmon, R.color.Coral, R.color.PaleVioletRed, R.color.MediumVioletRed, R.color.DimGray, R.color.DodgerBlue, R.color.Gold, R.color.LightCoral, R.color.Crimson, R.color.Tan,  R.color.Chocolate,  R.color.IndianRed,  R.color.DarkOrchid,  R.color.SlateGray,  R.color.DimGray,  R.color.CadetBlue,  R.color.RoyalBlue,  R.color.Navy,  R.color.DeepPink,  R.color.ForestGreen,  R.color.DarkCyan,  R.color.Black};

        cardView.setBackgroundResource(getRandomQuote(colors));

        String quote = getArguments().getString("quote");
        String author = getArguments().getString("author");

        quoteText.setText(quote);
        byAuthor.setText("_" + author);

        return v;
    }

    public static final QuoteFragment newInstance(String quote, String author)
    {
        QuoteFragment fragment = new QuoteFragment();
        Bundle bundle = new Bundle();
        bundle.putString("quote", quote);
        bundle.putString("author", author);
        fragment.setArguments(bundle);

        return fragment;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    int getRandomQuote(int [] colorArray)
    {
        int color;
        int quoteArrayLen = colorArray.length;

        int randomNo = ThreadLocalRandom.current().nextInt(quoteArrayLen);
        color = colorArray[randomNo];

        return color;
    }
}
