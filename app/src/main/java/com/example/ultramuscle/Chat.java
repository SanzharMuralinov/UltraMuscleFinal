package com.example.ultramuscle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Chat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        if(FirebaseAuth.getInstance().getCurrentUser() == null)
            startActivityForResult(AuthUI);
    }
}
