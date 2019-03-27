package com.motivation.dell.moneymotivation01.data;


import com.motivation.dell.moneymotivation01.model.Quote;

import java.util.ArrayList;

public interface QuoteListAsyncResponse {

    void processFinished(ArrayList<Quote> quotes);

}
