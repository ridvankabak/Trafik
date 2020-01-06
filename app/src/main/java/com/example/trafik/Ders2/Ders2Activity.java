package com.example.trafik.Ders2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.trafik.Ders1.Konular.Konu2Activity;
import com.example.trafik.Ders1.Konular.Konu3Activity;
import com.example.trafik.Ders1.Konular.Konu4Activity;
import com.example.trafik.Ders1.Konular.KonuActivity;
import com.example.trafik.Ders2.Konular.Konu2D2Activity;
import com.example.trafik.Ders2.Konular.Konu3D2Activity;
import com.example.trafik.Ders2.Konular.Konu5D2Activity;
import com.example.trafik.Ders2.Konular.Konu4D2Activity;
import com.example.trafik.Ders2.Konular.KonuD2Activity;
import com.example.trafik.R;
import com.example.trafik.TestActivity;
import com.example.trafik.Utils.CustomProgressBar;

import java.util.ArrayList;

public class Ders2Activity extends AppCompatActivity {
    int dailyGoal = 100;
    Button buttontest;

    CustomProgressBar progressBar,progressBar2,progressBar3,progressBar4,progressBar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ders2);

        progressBar = findViewById(R.id.d2_k1_progress_bar);
        progressBar2 = findViewById(R.id.d2_k2_progress_bar);
        progressBar3 = findViewById(R.id.d2_k3_progress_bar);
        progressBar4 = findViewById(R.id.d2_k4_progress_bar);
        progressBar5 = findViewById(R.id.d2_k5_progress_bar);

        buttontest = findViewById(R.id.buttonTest2);

        setupProgressBar();

        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), KonuD2Activity.class));
                finish();
            }
        });

        progressBar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu2D2Activity.class));
                finish();
            }
        });

        progressBar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu3D2Activity.class));
                finish();
            }
        });

        progressBar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu4D2Activity.class));
                finish();
            }
        });
        progressBar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu5D2Activity.class));
                finish();
            }
        });

        buttontest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TestActivity.class));
            }
        });

    }

    private void setupProgressBar() {

        int dailyXp = 20;

        progressBar.setMax(dailyGoal);

        progressBar.setProgressWithAnimation(dailyXp, 2000);

        int dailyXpp = 64;

        progressBar2.setMax(dailyGoal);

        progressBar2.setProgressWithAnimation(dailyXpp, 2000);

        int dailyXp2 = 65;

        progressBar3.setMax(dailyGoal);

        progressBar3.setProgressWithAnimation(dailyXp2, 2000);

        int dailyXpp2 = 33;

        progressBar4.setMax(dailyGoal);

        progressBar4.setProgressWithAnimation(dailyXpp2, 2000);

        int dailyXpp23 = 96;

        progressBar5.setMax(dailyGoal);

        progressBar5.setProgressWithAnimation(dailyXpp23, 2000);
    }
}
