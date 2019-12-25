package com.example.ultramuscle.TricepsFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class Triceps extends AppCompatActivity implements View.OnClickListener{

    private Button tricepsgym;
    private Button tricepshome;
    private Button abouttriceps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triceps);

        tricepsgym = (Button) findViewById(R.id.buttontriceps2);
        tricepsgym.setOnClickListener(this);
        tricepshome = (Button) findViewById(R.id.buttontriceps);
        tricepshome.setOnClickListener(this);
        abouttriceps = (Button) findViewById(R.id.buttontriceps3);
        abouttriceps.setOnClickListener(this);

    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.buttontriceps:
                Intent intent = new Intent(this, com.example.ultramuscle.TricepsFiles.TricepsHome.class);
                startActivity(intent);
                break;

            case R.id.buttontriceps2:
                Intent intent1 = new Intent(this, com.example.ultramuscle.TricepsFiles.TricepsGym.class);
                startActivity(intent1);
                break;
            case R.id.buttontriceps3:
                Intent intent2 = new Intent(this, com.example.ultramuscle.TricepsFiles.AboutTriceps.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
