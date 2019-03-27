package com.motivation.dell.moneymotivation01.data;


import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.motivation.dell.moneymotivation01.controller.AppController;
import com.motivation.dell.moneymotivation01.model.Quote;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuoteData {

    public ArrayList<Quote> quoteArrayList = new ArrayList<>();
    public ArrayList<Quote> quoteArrayListFinal = new ArrayList<>();
    Random r = new Random();
    int k;

    public void getQuotes(final QuoteListAsyncResponse callBack) {
        String url = "https://api.myjson.com/bins/78g4c";


        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for (int i = 0; i<response.length(); i++)
                {
                    try {

                        JSONObject quoteObject = response.getJSONObject(i);

                        Quote quote = new Quote();
                        quote.setQuote(quoteObject.getString("Quote"));
                        quote.setAuthor(quoteObject.getString("Author"));

                        //Log.d("STUFFF::", quoteObject.getString("Quote"));

                        quoteArrayList.add(quote);



                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
/*
                    for(int j = 0; j < quoteArrayList.size(); j++)
                    {
                        k = r.nextInt(3);
                        quoteArrayListFinal.add(quoteArrayList.get(j));

                    }*/

                }

                if(null != callBack)
                {
                    Collections.shuffle(quoteArrayList);
                    callBack.processFinished(quoteArrayList);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        AppController.getInstance().addToRequestQueue(jsonArrayRequest);
    }
}