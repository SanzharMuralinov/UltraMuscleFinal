package com.example.ultramuscle.GrudFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class Grud extends AppCompatActivity implements View.OnClickListener{

    private Button grudgym;
    private Button grudhome;
    private Button aboutgrud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grud);
        grudgym = (Button) findViewById(R.id.buttongrud2);
        grudgym.setOnClickListener(this);
        grudhome = (Button) findViewById(R.id.buttongrud1);
        grudhome.setOnClickListener(this);
        aboutgrud = (Button) findViewById(R.id.buttongrud3);
        aboutgrud.setOnClickListener(this);
    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.buttongrud1:
                Intent intent = new Intent(this, com.example.ultramuscle.GrudFiles.GrudHome.class);
                startActivity(intent);
                break;

            case R.id.buttongrud2:
                Intent intent1 = new Intent(this, com.example.ultramuscle.GrudFiles.GrudGym.class);
                startActivity(intent1);
                break;
            case R.id.buttongrud3:
                Intent intent2 = new Intent(this, com.example.ultramuscle.GrudFiles.AboutGrud.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
