package com.example.ultramuscle.PlechiFiles;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class AboutPlechi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutplechi);

        WebView browser=(WebView)findViewById(R.id.webBrowser4);
        browser.loadUrl("https://justsport.info/exercises/plechi-deltovidnye-uprazhneniya-osobennosti-trenirovki-anatomiya");
    }
}

