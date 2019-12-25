package com.example.ultramuscle.NogiFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class Nogi extends AppCompatActivity implements View.OnClickListener {

    private Button nogigym;
    private Button nogihome;
    private Button aboutnogi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nogi);

        nogigym = (Button) findViewById(R.id.buttonnogi2);
        nogigym.setOnClickListener(this);
        nogihome = (Button) findViewById(R.id.buttonnogi1);
        nogihome.setOnClickListener(this);
        aboutnogi = (Button) findViewById(R.id.buttonnogi3);
        aboutnogi.setOnClickListener(this);
    }


    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.buttonnogi1:
                Intent intent = new Intent(this, com.example.ultramuscle.NogiFiles.NogiHome.class);
                startActivity(intent);
                break;

            case R.id.buttonnogi2:
                Intent intent1 = new Intent(this, com.example.ultramuscle.NogiFiles.NogiGym.class);
                startActivity(intent1);
                break;
            case R.id.buttonnogi3:
                Intent intent2 = new Intent(this, com.example.ultramuscle.NogiFiles.AboutNogi.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }


}
