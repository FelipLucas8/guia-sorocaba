package com.example.guiadesorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class OldKickKustom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_kick_kustom);
    }

    public void btnNavegacao(View view){
        Uri uri = Uri.parse("google.navigation:q=Rua+Comendador+Hermelino+Matarzzo+Vila+Santa+Rita+52");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnSite(View view){
        Uri uri = Uri.parse("http://oldkick.com.br/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefone(View view){
        Uri uri = Uri.parse("tel:15991617996");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{ android.Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }
}