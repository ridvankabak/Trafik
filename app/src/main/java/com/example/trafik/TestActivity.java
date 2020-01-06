package com.example.trafik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView textViewY1,textViewD1,textViewY2,textViewD2,textViewY3,textViewD3,textViewY4,textViewD4,textViewY5,textViewD5,textViewY6,textViewD6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        textViewY1 = findViewById(R.id.yanlis1Text);
        textViewY2 = findViewById(R.id.yanlis2Text);
        textViewY3 = findViewById(R.id.yanlis3Text);
        textViewY4 = findViewById(R.id.yanlis4Text);
        textViewY5 = findViewById(R.id.yanlis5Text);
        textViewY6 = findViewById(R.id.yanlis6Text);

        textViewD1 = findViewById(R.id.dogru1Text);
        textViewD2 = findViewById(R.id.dogru2Text);
        textViewD3 = findViewById(R.id.dogru3Text);
        textViewD4 = findViewById(R.id.dogru4Text);
        textViewD5 = findViewById(R.id.dogru5Text);
        textViewD6 = findViewById(R.id.dogru6Text);



    }

    public void soru1yanlis(View v){

        textViewD1.setText("");
        textViewY1.setText("Yanlış Cevap");

    }

    public void soru1dogru(View v){
        textViewY1.setText("");
        textViewD1.setText("Doğru Cevap");

    }

    public void soru2yanlis(View v){
        textViewD2.setText("");
        textViewY2.setText("Yanlış Cevap");

    }

    public void soru2dogru(View v){
        textViewY2.setText("");
        textViewD2.setText("Doğru Cevap");


    }

    public void soru3yanlis(View v){
        textViewD3.setText("");
        textViewY3.setText("Yanlış Cevap");

    }

    public void soru3dogru(View v){
        textViewY3.setText("");
        textViewD3.setText("Doğru Cevap");


    }

    public void soru4yanlis(View v){
        textViewD4.setText("");
        textViewY4.setText("Yanlış Cevap");

    }

    public void soru4dogru(View v){
        textViewY4.setText("");
        textViewD4.setText("Doğru Cevap");


    }
    public void soru5yanlis(View v){
        textViewD5.setText("");
        textViewY5.setText("Yanlış Cevap");

    }

    public void soru5dogru(View v){
        textViewY5.setText("");
        textViewD5.setText("Doğru Cevap");

    }

    public void soru6yanlis(View v){
        textViewD6.setText("");
        textViewY6.setText("Yanlış Cevap");

    }

    public void soru6dogru(View v){
        textViewY6.setText("");
        textViewD6.setText("Doğru Cevap");

    }
    


}
