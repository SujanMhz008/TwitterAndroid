package com.sujanmaharjan008.twitter.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.sujanmaharjan008.twitter.R;

public class PolicyActivity extends AppCompatActivity {

    private TextView txtPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        txtPolicy = findViewById(R.id.txtPolicy);
        txtPolicy.setText(Html.fromHtml(" By signing up, you agree to the <font color=\"#38A1F3\">Terms of Service</font> and <font color=\"#38A1F3\">Privacy Policy</font>, including <font color=\"#38A1F3\">Cookie Use</font>. Others will be able to find you by email or phone number when provided . <font color=\"#38A1F3\">Privacy Options</font>\n"));
    }
}
