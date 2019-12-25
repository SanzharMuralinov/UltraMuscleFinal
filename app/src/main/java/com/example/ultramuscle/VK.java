package com.example.ultramuscle;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class VK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vk);

        WebView browser=(WebView)findViewById(R.id.webBrowser7);
        browser.loadUrl("https://vk.com");
    }
}
