package com.sevenapp.myapplication.backend.handler;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;
import com.sevenapp.myapplication.backend.BackendConstants;

public class WeatherRequest {

    public static void getWeather(String city, String days, TextHttpResponseHandler asyncHTTPClient) {
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();

        params.add("q", city);
        params.add("mode", "json");
        params.add("units", "metric");
        params.add("appid", "2de143494c0b295cca9337e1e96b00e0");
        params.add("cnt", days);

        client.get(BackendConstants.BASE_URL + BackendConstants.ENDPOINT, params, asyncHTTPClient);
    }
}
