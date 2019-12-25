package com.example.ultramuscle.NogiFiles;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class AboutNogi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutnogi);

        WebView browser=(WebView)findViewById(R.id.webBrowser3);
        browser.loadUrl("https://justsport.info/exercises/bitseps-bedra-uprazhneniya-anatomiya-osobennosti-trenirovki");
    }
}

