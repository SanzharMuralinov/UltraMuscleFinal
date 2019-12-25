package com.example.ultramuscle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.BicepsFiles.Biceps;
import com.example.ultramuscle.GrudFiles.Grud;
import com.example.ultramuscle.PlechiFiles.Plechi;

public class Contact extends AppCompatActivity implements View.OnClickListener {

    private ImageButton VK;
    private ImageButton Insta;
    private ImageButton Gmail;


    private Button trener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);

        Button trener = (Button) findViewById(R.id.trener);
        trener.setOnClickListener(this);

        ImageButton VK = (ImageButton) findViewById(R.id.vk);
        VK.setOnClickListener(this);
        ImageButton Insta = (ImageButton) findViewById(R.id.insta);
        Insta.setOnClickListener(this);
        ImageButton Gmail = (ImageButton) findViewById(R.id.gmail);
        Gmail.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.vk:
                Intent intent = new Intent(this, VK.class);
                startActivity(intent);
                break;

            case R.id.insta:
                Intent intent1 = new Intent(this, Insta.class);
                startActivity(intent1);
                break;

            case R.id.gmail:
                Intent intent2 = new Intent(this, Gmail.class);
                startActivity(intent2);
                break;

            case R.id.trener:
                Intent intent3 = new Intent(this, Trener.class);
                startActivity(intent3);
                break;

            default:
                break;
        }
    }
}