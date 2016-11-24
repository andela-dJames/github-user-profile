package com.danieljames.assessmentapp.data.dal;

import com.danieljames.assessmentapp.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by danieljames on 11/24/16.
 */

public class ApiClient {

    public static Retrofit buildApiClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
