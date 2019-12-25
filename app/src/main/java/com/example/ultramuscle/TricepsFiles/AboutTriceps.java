package com.example.ultramuscle.TricepsFiles;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class AboutTriceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abouttriceps);

        WebView browser=(WebView)findViewById(R.id.webBrowser5);
        browser.loadUrl("https://justsport.info/exercises/tritseps-uprazhneniya-anatomiya-osobennosti-trenirovki");
    }
}

