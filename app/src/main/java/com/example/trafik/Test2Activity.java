package com.example.trafik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Test2Activity extends AppCompatActivity {
    TextView textViewY1,textViewD1,textViewY2,textViewD2,textViewY3,textViewD3,textViewY4,textViewD4,textViewY5,textViewD5,textViewY6,textViewD6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        textViewY1 = findViewById(R.id.yanlis1Text2);
        textViewY2 = findViewById(R.id.yanlis2Text2);
        textViewY3 = findViewById(R.id.yanlis3Text2);
        textViewY4 = findViewById(R.id.yanlis4Text2);
        textViewY5 = findViewById(R.id.yanlis5Text2);
        textViewY6 = findViewById(R.id.yanlis6Text2);

        textViewD1 = findViewById(R.id.dogru1Text2);
        textViewD2 = findViewById(R.id.dogru2Text2);
        textViewD3 = findViewById(R.id.dogru3Text2);
        textViewD4 = findViewById(R.id.dogru4Text2);
        textViewD5 = findViewById(R.id.dogru5Text2);
        textViewD6 = findViewById(R.id.dogru6Text2);
    }

    public void soru1yanlis2(View v){

        textViewD1.setText("");
        textViewY1.setText("Yanlış Cevap");

    }

    public void soru1dogru2(View v){
        textViewY1.setText("");
        textViewD1.setText("Doğru Cevap");

    }

    public void soru2yanlis2(View v){
        textViewD2.setText("");
        textViewY2.setText("Yanlış Cevap");

    }

    public void soru2dogru2(View v){
        textViewY2.setText("");
        textViewD2.setText("Doğru Cevap");


    }

    public void soru3yanlis2(View v){
        textViewD3.setText("");
        textViewY3.setText("Yanlış Cevap");

    }

    public void soru3dogru2(View v){
        textViewY3.setText("");
        textViewD3.setText("Doğru Cevap");


    }

    public void soru4yanlis2(View v){
        textViewD4.setText("");
        textViewY4.setText("Yanlış Cevap");

    }

    public void soru4dogru2(View v){
        textViewY4.setText("");
        textViewD4.setText("Doğru Cevap");


    }
    public void soru5yanlis2(View v){
        textViewD5.setText("");
        textViewY5.setText("Yanlış Cevap");

    }

    public void soru5dogru2(View v){
        textViewY5.setText("");
        textViewD5.setText("Doğru Cevap");

    }

    public void soru6yanlis2(View v){
        textViewD6.setText("");
        textViewY6.setText("Yanlış Cevap");

    }

    public void soru6dogru2(View v){
        textViewY6.setText("");
        textViewD6.setText("Doğru Cevap");

    }

    /**
        14-B 18-D 22-D 26-c 28-d 23-a
     */

}
