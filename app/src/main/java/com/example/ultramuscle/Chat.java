package com.example.ultramuscle;

import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;


public class Chat extends AppCompatActivity {


    private static int SIGN_IN_CODE = 1;
    private RelativeLayout chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

        //@Override
        //protected void onActivityResult(int requestCode, int resultCode, Nullable Intent data) {
        //  super.onActivityResult(requestCode, resultCode, data);
        //}

        //@Override
        //protected void onCreate(Bundle savedInstanceState) {
        //  super.onCreate(savedInstanceState);
        //setContentView(R.layout.chat);

        //chat = findViewById(R.id.chat);


        //if(FirebaseAuth.getInstance().getCurrentUser() == null)
        //  startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(), SIGN_IN_CODE);
        //else
        //  Snackbar.make(chat, "Вы авторизованы", Snackbar.LENGTH_LONG).show();

        //displayAllMessages();
        //}

        //private void displayAllMessages() {

        //}
    }
}
