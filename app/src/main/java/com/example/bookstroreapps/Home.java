package com.example.bookstroreapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    TextView tv_welcome;
    Button btn_contactUs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_welcome = findViewById(R.id.text_welcome);
        btn_contactUs = findViewById(R.id.btnContactUs);

        Intent welcome = getIntent();
        tv_welcome.setText("Hi, " + welcome.getStringExtra("email_key"));

        btn_contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactUs = new Intent(Home.this, ContactUs.class);
                startActivity(contactUs);
            }
        });
    }
}
