package com.example.jogja_budaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BerceritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bercerita);

        getSupportActionBar().hide();
    }
}