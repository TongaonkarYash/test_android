package com.yashtongaonkar.myapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yashtongaonkar.myapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startThread();
    }


    private void startThread() {
        new Thread(() -> {
            try {
                Thread.sleep(1500);
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }).start();
    }
}
