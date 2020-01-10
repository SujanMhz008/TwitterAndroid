package com.sujanmaharjan008.twitter.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sujanmaharjan008.twitter.BottomNavActivity;
import com.sujanmaharjan008.twitter.R;
import com.sujanmaharjan008.twitter.bll.LoginBLL;
import com.sujanmaharjan008.twitter.strictmode.StrictModeClass;

public class LogInActivity extends AppCompatActivity {

    private EditText edtUserNameL, edtPasswordL;
    private Button btnLogin;
    private TextView txtSignUpL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        edtUserNameL = findViewById(R.id.edtUsernameL);
        edtPasswordL = findViewById(R.id.edtPasswordL);
        btnLogin = findViewById(R.id.btnLogin);
        txtSignUpL = findViewById(R.id.txtSignUpL);

        txtSignUpL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogInActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edtUserNameL.getText().toString())) {
                    edtUserNameL.setError("Please enter your username");
                    return;
                }
                else if(TextUtils.isEmpty(edtPasswordL.getText().toString())){
                    edtPasswordL.setError("Please enter your email");
                    return;
                }
                StrictModeClass.StrictMode();

                LoginBLL loginBLL = new LoginBLL();

                if (loginBLL.checkUser(edtUserNameL.getText().toString(), edtPasswordL.getText().toString())) {
                    Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LogInActivity.this, "Either username or password is incorrect.", Toast.LENGTH_SHORT).show();
                    edtUserNameL.requestFocus();
                }
            }
        });
    }
}
