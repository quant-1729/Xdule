package com.example.xdule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private Button button;
    private Toolbar toolbar;
    private AutoCompleteTextView autoCompleteTextView;
    String url="https://www.mnnit.ac.in/#login_form";
    String [] atvtext= {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview1= findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);


        webview1.setWebChromeClient(new WebChromeClient());
        webview1.loadUrl(url);

        //removing the action bar
        // the app is crashing on adding the supportrequestwindowsfeature;
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //removing the action bar completed


        //Setting auto complete days
        AutoCompleteTextView atv1= findViewById(R.id.atv1);
        atv1.setAdapter(new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, atvtext));






    }








}