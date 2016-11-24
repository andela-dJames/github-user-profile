package com.danieljames.assessmentapp.data.dal;

import com.danieljames.assessmentapp.domain.model.GithubCommit;
import com.danieljames.assessmentapp.domain.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoint {

    @GET("commits")
    Call<List<GithubCommit>> getCommits();

    @GET
    Call<List<GithubUser>> getCommiters();

}
