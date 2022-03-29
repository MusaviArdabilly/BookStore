package com.example.bookstroreapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactUs extends AppCompatActivity {

    Button btn_Facebook, btn_Instagram, btn_Email, btn_Whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        btn_Facebook = findViewById(R.id.btnFb);
        btn_Instagram = findViewById(R.id.btnIg);
        btn_Email = findViewById(R.id.btnEmail);
        btn_Whatsapp = findViewById(R.id.btnWa);

        btn_Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/";
                Intent facebook = new Intent(Intent.ACTION_VIEW);
                facebook.setData(Uri.parse(url));
                startActivity(facebook);
            }
        });
        btn_Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/";
                Intent instagram = new Intent(Intent.ACTION_VIEW);
                instagram.setData(Uri.parse(url));
                startActivity(instagram);
            }
        });
        btn_Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://mail.google.com/";
                Intent email = new Intent(Intent.ACTION_VIEW);
                email.setData(Uri.parse(url));
                startActivity(email);
            }
        });
        btn_Whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://api.whatsapp.com/send/?phone=%2B6281234567890&text&app_absent=0";
                Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                whatsapp.setData(Uri.parse(url));
                startActivity(whatsapp);
            }
        });
    }
}