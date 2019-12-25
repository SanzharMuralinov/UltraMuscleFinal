package com.example.ultramuscle.BicepsFiles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.R;

public class Biceps extends AppCompatActivity implements View.OnClickListener{

    private Button bicepsgym;
    private Button bicepshome;
    private Button aboutbiceps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biceps);

        bicepsgym = (Button) findViewById(R.id.biceps_button2);
        bicepsgym.setOnClickListener(this);
        bicepshome = (Button) findViewById(R.id.biceps_button);
        bicepshome.setOnClickListener(this);
        aboutbiceps = (Button) findViewById(R.id.biceps_button3);
        aboutbiceps.setOnClickListener(this);

    }

    @Override
    public void onClick(View d) {
        switch (d.getId()) {
            case R.id.biceps_button:
                Intent intent = new Intent(this, com.example.ultramuscle.BicepsFiles.BicepsHome.class);
                startActivity(intent);
                break;

            case R.id.biceps_button2:
                Intent intent1 = new Intent(this, com.example.ultramuscle.BicepsFiles.BicepsGym.class);
                startActivity(intent1);
                break;
            case R.id.biceps_button3:
                Intent intent2 = new Intent(this, com.example.ultramuscle.BicepsFiles.AboutBiceps.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
