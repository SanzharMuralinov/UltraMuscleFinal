package com.example.ultramuscle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ultramuscle.BicepsFiles.Biceps;

public class Trener extends AppCompatActivity implements View.OnClickListener {

    private Button write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trener);
        Button write = (Button) findViewById(R.id.write);
        write.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Chat.class);
        startActivity(intent);
    }
}
