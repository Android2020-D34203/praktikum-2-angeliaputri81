package com.example.projectkalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText bilangan1, bilangan2, operasi;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.tombol);
        bilangan1 = findViewById(R.id.bil1);
        bilangan2 = findViewById(R.id.bil2);
        operasi = findViewById(R.id.opr);
        textView = findViewById(R.id.result);
    }

    public void hitung(View V){
        Double a = Double.parseDouble(bilangan1.getText().toString());
        Double b = Double.parseDouble(bilangan2.getText().toString());
        Double result ;
        String operation = operasi.getText().toString();

        if(operation.equals("+")){
            result = a+b;
            textView.setText("HASIL OPERASI ADALAH : "+result);
        }
        else if(operation.equals("-")){
            result = a-b;
            textView.setText("HASIL OPERASI ADALAH : "+result);
        }
        else if(operation.equals("/")){
            result = a/b;
            textView.setText("HASIL OPERASI ADALAH : "+result);
        }
        else if(operation.equals("*")){
            result = a*b;
            textView.setText("HASIL OPERASI ADALAH : "+result);
        }
        else {
            textView.setText("OPERASI HASIL ARITMATIKA TIDAK SESUAI");
        }
    }
}