package com.zsp.myproductflavorsdemo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private TextView url;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        url = findViewById(R.id.url);
        textView.setBackgroundResource(R.mipmap.girl);
        url.setText("基地址:" + GetURL.getBaseUrl()+"----》APP_SERVER："+BuildConfig.APP_SERVER);
    }
}
