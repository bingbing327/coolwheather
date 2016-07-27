package com.coolweather.app.util;

/**
 * Created by Jiang Meng on 2016/7/25.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
