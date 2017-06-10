package com.example.administrator.weather.util;

/**
 * Created by Administrator on 2017/6/8.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
