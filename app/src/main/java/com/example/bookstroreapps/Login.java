package com.example.bookstroreapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button btn_Login;
    EditText et_Email, et_Password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_Email = findViewById(R.id.etEmail);
        et_Password = findViewById(R.id.etPassword);
        btn_Login = findViewById(R.id.btnLogin);

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = et_Email.getText().toString();
                String password = et_Password.getText().toString();

                if (email.equals("user") || password.equals("1234")){
                    Toast.makeText(Login.this, "You are logged in", Toast.LENGTH_SHORT).show();
                    Intent login = new Intent(Login.this, Home.class);
                    login.putExtra("email_key", email);
                    startActivity(login);
                }else{
                    Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
