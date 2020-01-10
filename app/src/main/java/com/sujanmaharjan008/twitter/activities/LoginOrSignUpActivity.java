package com.sujanmaharjan008.twitter.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sujanmaharjan008.twitter.R;

public class LoginOrSignUpActivity extends AppCompatActivity {
    private Button btnCreateAcc;
    private TextView txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_sign_up);

        btnCreateAcc = findViewById(R.id.btnCreateAcc);
        txtLogin = findViewById(R.id.edtBtnLogin);

        btnCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrSignUpActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrSignUpActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}
