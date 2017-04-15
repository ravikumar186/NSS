package com.example.raviranjan.navigation;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;


public class Share extends Fragment {

    Button button;
    TextView textView;
    String server_urlt="http://nsskprsv.000webhostapp.com/greetings.php";
    String server_urlp="http://nsskprsv.000webhostapp.com/pic7.jpg";
    RequestQueue requestQueue;
    ImageView imageView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_share,container,false);

        textView=(TextView)view.findViewById(R.id.txt);
        imageView = (ImageView)view.findViewById(R.id.img);


        StringRequest stringRequest=new StringRequest(Request.Method.POST,server_urlt,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                textView.setText(response);
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textView.setText("something went wrong.....");
                        error.printStackTrace();
                    }
                }
                );
                Mysingleton.getInstance(getActivity()).addToRequsetque(stringRequest);


        ImageRequest imageRequest = new ImageRequest(server_urlp,

                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        imageView.setImageBitmap(response);
                    }
                }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                error.printStackTrace();
            }

        });
        Mysingleton.getInstance(getActivity()).addToRequsetque(imageRequest);
        return view;

    }
}
