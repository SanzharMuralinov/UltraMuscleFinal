package com.example.ultramuscle.PlechiFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class Plechi extends AppCompatActivity implements View.OnClickListener{

    private Button plechigym;
    private Button plechihome;
    private Button aboutplechi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plechi);

        plechigym = (Button) findViewById(R.id.buttonplechi2);
        plechigym.setOnClickListener(this);
        plechihome = (Button) findViewById(R.id.buttonplechi1);
        plechihome.setOnClickListener(this);
        aboutplechi = (Button) findViewById(R.id.buttonplechi3);
        aboutplechi.setOnClickListener(this);
    }


    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.buttonplechi1:
                Intent intent = new Intent(this, com.example.ultramuscle.PlechiFiles.PlechiHome.class);
                startActivity(intent);
                break;

            case R.id.buttonplechi2:
                Intent intent1 = new Intent(this, com.example.ultramuscle.PlechiFiles.PlechiGym.class);
                startActivity(intent1);
                break;
            case R.id.buttonplechi3:
                Intent intent2 = new Intent(this, com.example.ultramuscle.PlechiFiles.AboutPlechi.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
