package com.example.xdule;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    DB_handeler dbresult = new DB_handeler(Result.this, "String",null,1);
    public String getcommandfrommainactivity(String str){
        return str;}





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        //removing the action bar
        // the app is crashing on adding the supportrequestwindowsfeature;
        //supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        //removing the action bar completed
        StringBuilder sb = new StringBuilder();

        TextView resultview = findViewById(R.id.resultview);

    }}
