package com.example.guiadesorocaba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BotequimFrancisca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botequim_francisca);
    }

    public void btnNavegacao(View view){
        Uri uri = Uri.parse("google.navigation:q=R.+Francisca+de+Queiroz+Vila+Independencia+125");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnSite(View view){
        Uri uri = Uri.parse("http://www.botequimdafrancisca.com.br/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnTelefone(View view){
        Uri uri = Uri.parse("tel:1532221623");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{ android.Manifest.permission.CALL_PHONE},1);
        } else {
            startActivity(intent);
        }
    }
}