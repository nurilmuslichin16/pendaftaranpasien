package com.example.pendaftaranpasien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LupaPassword extends AppCompatActivity {

    TextView tv_backlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        tv_backlogin = (TextView) findViewById(R.id.tv_backlogin);
        tv_backlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLogin = new Intent(LupaPassword.this, MainActivity.class);
                startActivity(toLogin);
            }
        });
    }
}