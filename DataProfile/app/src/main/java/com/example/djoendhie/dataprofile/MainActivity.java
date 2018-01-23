package com.example.djoendhie.dataprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    EditText Name, Adress, Email, Telp;
    Button btn;
    TextView txtFull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Adress = (EditText)findViewById(R.id.etAddress);
        Email = (EditText)findViewById(R.id.etEmail);
        Telp = (EditText)findViewById(R.id.etTelp);
        btn = (Button)findViewById(R.id.btnInput);
        txtFull = (TextView)findViewById(R.id.txtFull);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aName = Name.getText().toString();
                String aAdress = Adress.getText().toString();
                String aEmail = Email.getText().toString();
                String aTelp = Telp.getText().toString();

                if (aName.isEmpty()) {
                    Name.setError("Woyyy isi");
                }else if (aAdress.isEmpty()) {
                    Adress.setError("Isi lah");
                }else if (aEmail.isEmpty()) {
                    Email.setError("Isi lah");
                }else if (aTelp.isEmpty()) {
                    Telp.setError("Isi lah");
                }

                txtFull.setText("Nama : " + aName + "Alamat : " + aAdress + "Email : " + aEmail + "Telp : " + aTelp);
            }
        });

    }
}
