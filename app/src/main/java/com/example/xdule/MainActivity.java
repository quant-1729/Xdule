package com.example.xdule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private Button button;
    String url="https://www.mnnit.ac.in/#login_form";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview1= findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);


        webview1.setWebChromeClient(new WebChromeClient());
        webview1.loadUrl(url);







    }
}