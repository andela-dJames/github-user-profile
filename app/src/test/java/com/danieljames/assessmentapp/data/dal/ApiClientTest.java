package com.danieljames.assessmentapp.data.dal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import retrofit2.Retrofit;

import static org.junit.Assert.*;


public class ApiClientTest {

    @Mock
    ApiClient apiClient;

    @Before

    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void create_newApi_client(){
        apiClient.buildApiClient();
        assertTrue(apiClient != null);
    }

}