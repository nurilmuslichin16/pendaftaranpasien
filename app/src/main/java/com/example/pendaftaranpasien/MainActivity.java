package com.example.pendaftaranpasien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_lupaapassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_lupaapassword = (TextView) findViewById(R.id.tv_lupapassword);
        tv_lupaapassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toLupaPass = new Intent(MainActivity.this, LupaPassword.class);
                startActivity(toLupaPass);
            }
        });
    }
}