package com.example.djoendhie.discount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Sum, Price;
    Button Count;
    TextView Got;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sum = (EditText)findViewById(R.id.etSum);
        Price = (EditText)findViewById(R.id.etPrice);
        Count = (Button)findViewById(R.id.btnCount);
        Got = (TextView)findViewById(R.id.txtDisc);

        Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aSum = Sum.getText().toString();
                String aPrice = Price.getText().toString();

                int nSum = Integer.parseInt(aSum);
                int nPrice = Integer.parseInt(aPrice);

                int total = nSum * nPrice;
                int Cut = total /2;

                if (nSum >= 10 ){
                    Got.setText("Price = " + total + "Discount = " + Cut);
                    Toast.makeText(getApplicationContext(), "Congrats", Toast.LENGTH_SHORT).show();
                }else if (nSum <= 10){
                    Got.setText("Price = " + total);
                    Toast.makeText(getApplicationContext(), "Buy more to get Discount", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
