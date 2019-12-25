package com.example.ultramuscle.BicepsFiles;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.ultramuscle.R;

public class AboutBiceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutbiceps);
        WebView browser=(WebView)findViewById(R.id.webBrowser);
        browser.loadUrl("https://justsport.info/exercises/bitseps-uprazhneniya-anatomiya-osobennosti-trenirovki");


    }
}
