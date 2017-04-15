package com.example.raviranjan.navigation;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by RAVI RANJAN on 15-04-2017.
 */

public class Mysingleton {
    private static Mysingleton mInstance;
    private RequestQueue requestQueue;
    private static Context mCtx;

    private Mysingleton(Context context) {
        mCtx = context;
        requestQueue = getRequestQue();
    }


    public RequestQueue getRequestQue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized Mysingleton getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new Mysingleton(context);

        }
        return mInstance;
    }
    public<T> void addToRequsetque(Request<T> request)
    {
        requestQueue.add(request);

    }
}
