package com.danieljames.assessmentapp.data.dal;

import com.danieljames.assessmentapp.domain.model.GithubCommit;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class AppClientTest {
    @Mock
    AppClient appClient;

    @Before

    public void setUp(){
        MockitoAnnotations.initMocks(this);
        appClient = new AppClient();
    }
    @Test
    public void get_list_of_committers(){
        appClient.getListOfCommitters(new DataCallBack<List<GithubCommit>>() {
            @Override
            public void onSuccess(List<GithubCommit> data) {
                System.out.println("data = " + data);
                assertTrue(!data.isEmpty());
            }

            @Override
            public void onError(String errorMessage) {

            }
        });

    }
}