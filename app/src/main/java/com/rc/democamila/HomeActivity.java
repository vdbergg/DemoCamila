package com.rc.democamila;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvEmail;
    private TextView tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvEmail = (TextView) findViewById(R.id.tv_show_email);
        tvPassword = (TextView) findViewById(R.id.tv_show_password);

        Intent intent = getIntent();
        Bundle dados = new Bundle();
        dados = intent.getExtras();
        String email = "Seu email: " + dados.getString("email").toString();
        tvEmail.setText(email);
        String password = "Sua senha: " + dados.getString("password").toString();
        tvPassword.setText(password);

    }
}
