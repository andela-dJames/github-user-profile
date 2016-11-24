package com.danieljames.assessmentapp.data.dal;

public interface DataCallBack<T> {

    void onSuccess(T data);
    void onError(String errorMessage);
}
