package com.example.guiadesorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class JackPub extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jack_pub);
    }

    public void btnNavegacao(View view){
        Uri uri = Uri.parse("google.navigation:q=Av.+Domingos=+Júlio+Parque+Campolim+715");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnSite(View view){
        Uri uri = Uri.parse("http://www.jackpubsorocaba.com.br/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefone(View view){
        Uri uri = Uri.parse("tel:1534181833");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{ android.Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }
}