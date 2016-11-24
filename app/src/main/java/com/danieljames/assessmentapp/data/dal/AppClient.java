package com.danieljames.assessmentapp.data.dal;


import android.util.Log;

import com.danieljames.assessmentapp.domain.interactors.GetCommiterList;
import com.danieljames.assessmentapp.domain.model.GithubCommit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AppClient{

    Retrofit client;

    public AppClient() {
        client = ApiClient.buildApiClient();
    }

    public void getListOfCommitters(DataCallBack<List<GithubCommit>> callBack){
        getData(new Supplier<Call<List<GithubCommit>>>() {
            @Override
            public Call<List<GithubCommit>> get() {
                return client.create(EndPoint.class).getCommits();
            }
        }, callBack);


    }

    private <T>  void getData(Supplier<Call<T>> supplier, final DataCallBack<T> callback){
        Call<T> call = supplier.get();
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if (response.body() != null) {
                    callback.onSuccess(response.body());
                    Log.e("TAG", "onResponse: " + response.body());
                    Log.d("onResponse: ", response.body().toString());
                } else {
                    callback.onError(response.message());
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {

            }
        });
    }


}
