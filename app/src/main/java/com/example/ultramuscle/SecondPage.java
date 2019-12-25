package com.example.ultramuscle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.ultramuscle.BicepsFiles.Biceps;
import com.example.ultramuscle.GrudFiles.Grud;
import com.example.ultramuscle.NogiFiles.Nogi;
import com.example.ultramuscle.PlechiFiles.Plechi;
import com.example.ultramuscle.TricepsFiles.Triceps;

public class SecondPage extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ImageButtonBiceps;
    private ImageButton ImageButtonGrud;
    private ImageButton ImageButtonTriceps;
    private ImageButton ImageButtonNogi;
    private ImageButton ImageButtonPlechi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second_page);
        ImageButton imageButtonBiceps = (ImageButton) findViewById(R.id.imageButtonBiceps);
        imageButtonBiceps.setOnClickListener(this);

        ImageButton imageButtonGrud = (ImageButton) findViewById(R.id.imageButtonGrud);
        imageButtonGrud.setOnClickListener(this);
        ImageButton imageButtonNogi = (ImageButton) findViewById(R.id.imageButtonNogi);
        imageButtonNogi.setOnClickListener(this);
        ImageButton imageButtonTriceps = (ImageButton) findViewById(R.id.imageButtonTriceps);
        imageButtonTriceps.setOnClickListener(this);
        ImageButton imageButtonPlechi = (ImageButton) findViewById(R.id.imageButtonPlechi);
        imageButtonPlechi.setOnClickListener(this);
    }


        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.imageButtonBiceps:
                    Intent intent = new Intent(this, Biceps.class);
                    startActivity(intent);
                    break;

                case R.id.imageButtonGrud:
                    Intent intent1 = new Intent(this, Grud.class);
                    startActivity(intent1);
                    break;

                case R.id.imageButtonPlechi:
                    Intent intent2 = new Intent(this, Plechi.class);
                    startActivity(intent2);
                    break;

                case R.id.imageButtonNogi:
                    Intent intent3 = new Intent(this, Nogi.class);
                    startActivity(intent3);
                    break;

                case R.id.imageButtonTriceps:
                    Intent intent4 = new Intent(this, Triceps.class);
                    startActivity(intent4);
                    break;
                default:
                    break;

            }


        }

    }


