package com.example.ultramuscle;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Insta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insta);

        WebView browser=(WebView)findViewById(R.id.webBrowser6);
        browser.loadUrl("https://www.instagram.com");
    }
}
