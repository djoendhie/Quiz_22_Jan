package com.example.djoendhie.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Login, Pass;
    Button Enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = (EditText)findViewById(R.id.etUser);
        Pass = (EditText)findViewById(R.id.etPass);
        Enter = (Button)findViewById(R.id.btnLogin);

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aLogin = Login.getText().toString();
                String aPass = Pass.getText().toString();

                if (aLogin.isEmpty()){
                    Login.setError("isi dulu");
                    Login.requestFocus();
                }else if (aPass.isEmpty()){
                    Pass.setError("isi ");
                    Pass.requestFocus();
                }else {
                    if (aLogin.equalsIgnoreCase("djoendhie" ) && aPass.equalsIgnoreCase("kitabisa")){
                        startActivity(new Intent(MainActivity.this, com.example.djoendhie.login.Login.class));
                        finish();
                    }else {
                        Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
                        
                    }
                }
            }
        });
    }
}
