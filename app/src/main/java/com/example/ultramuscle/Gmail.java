package com.example.ultramuscle;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Gmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmail);

        WebView browser=(WebView)findViewById(R.id.webBrowser8);
        browser.loadUrl("https://mail.google.com/mail/u/0/#inbox");
    }
}
