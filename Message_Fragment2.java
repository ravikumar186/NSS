package com.example.raviranjan.navigation;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MessageFragment extends Fragment {

    Button button1,button2,button3,button4,button5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_message, container, false);
        button1 = (Button)view.findViewById(R.id.button1);
        button2 = (Button)view.findViewById(R.id.button2);
        button3 = (Button)view.findViewById(R.id.button3);
        button4 = (Button)view.findViewById(R.id.button4);
        button5 = (Button)view.findViewById(R.id.button5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent make_call=new Intent(Intent.ACTION_CALL);
                make_call.setData(Uri.parse("tel:8196040213"));
                startActivity(make_call);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent make_call=new Intent(Intent.ACTION_CALL);
                make_call.setData(Uri.parse("tel:1234567"));
                startActivity(make_call);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent make_call=new Intent(Intent.ACTION_CALL);
                make_call.setData(Uri.parse("tel:2343433"));
                startActivity(make_call);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent make_call=new Intent(Intent.ACTION_CALL);
                make_call.setData(Uri.parse("tel:433434242"));
                startActivity(make_call);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent make_call=new Intent(Intent.ACTION_CALL);
                make_call.setData(Uri.parse("tel:4354354343"));
                startActivity(make_call);
            }
        });
        return view;


    }


}
