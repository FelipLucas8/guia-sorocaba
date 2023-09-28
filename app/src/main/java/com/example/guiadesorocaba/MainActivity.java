package com.example.guiadesorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnBotequimFrancisca(View view){
        Intent intent = new Intent(this, BotequimFrancisca.class);
        startActivity(intent);
    }

    public void btnJackPub(View view){
        Intent intent = new Intent(this, JackPub.class);
        startActivity(intent);
    }

    public void btnOldKickKustom(View view){
        Intent intent = new Intent(this, OldKickKustom.class);
        startActivity(intent);
    }
}