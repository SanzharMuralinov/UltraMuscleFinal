package com.example.ultramuscle.GrudFiles;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class AboutGrud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutgrud);
        WebView browser=(WebView)findViewById(R.id.webBrowser2);
        browser.loadUrl("https://justsport.info/exercises/grud-uprazhneniya-osobennosti-trenirovki-anatomiya");
    }
}

