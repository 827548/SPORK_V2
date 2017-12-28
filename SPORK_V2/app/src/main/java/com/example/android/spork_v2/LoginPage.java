package com.example.android.spork_v2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    Button btnLogin;
    CardView btnCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        btnLogin = (Button) findViewById(R.id.LoginButtonText);
        btnCard = (CardView) findViewById(R.id.LoginButton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLogin.setBackgroundColor(14040064);

            }
        });
    }
}
