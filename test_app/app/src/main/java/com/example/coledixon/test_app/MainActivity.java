package com.example.coledixon.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// This is the main activity (the entry point for your app).
// When you build and run the app, the system launches an instance of this Activity and loads its layout.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
