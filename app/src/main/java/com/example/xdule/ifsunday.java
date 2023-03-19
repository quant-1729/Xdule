package com.example.xdule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class ifsunday extends AppCompatActivity {
    WebView webView;
    String url ="https//www.instagram.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifsunday);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        WebView webView2= findViewById(R.id.webview2);
        webView2.setWebChromeClient(new WebChromeClient());
        webView2.loadUrl(url);

    }
}