package com.sujanmaharjan008.twitter.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.sujanmaharjan008.twitter.R;

public class VerifyCodeActivity extends AppCompatActivity {

    private Button btnNextVCA;
    private EditText edtCode;
    private String name, email;
    private ImageButton btnImageBackVCA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_code);

        edtCode = findViewById(R.id.edtCode);
        btnNextVCA = findViewById(R.id.btnNextVCA);
        btnImageBackVCA = findViewById(R.id.imagebtnbackVCA);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("Name");
            email = bundle.getString("Email");
        }

        edtCode.setText("555555");

        btnNextVCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtCode.getText().toString().equals("555555")) {
                    Intent intent = new Intent(VerifyCodeActivity.this, PasswordActivity.class);
                    intent.putExtra("Name", name);
                    intent.putExtra("Email", email);
                    startActivity(intent);
                }
                else if(TextUtils.isEmpty(edtCode.getText().toString())){
                    edtCode.setError("Code must be set");
                    return;
                }
                else {
                    edtCode.setError("Code must be 555555");
                    return;
                }
            }
        });
        btnImageBackVCA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyCodeActivity.this, PolicyActivity.class);
                startActivity(intent);
            }
        });
    }
}
