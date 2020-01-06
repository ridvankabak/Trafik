package com.example.trafik.Ders1;

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
import com.example.trafik.R;
import com.example.trafik.Test2Activity;
import com.example.trafik.Utils.CustomProgressBar;

public class Ders1Activity extends AppCompatActivity {
    int dailyGoal = 100;
    Button buttonTest;

    CustomProgressBar progressBar,progressBar2,progressBar3,progressBar4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ders1);

        progressBar = findViewById(R.id.d1_k1_progress_bar);
        progressBar2 = findViewById(R.id.d1_k2_progress_bar);
        progressBar3 = findViewById(R.id.d1_k3_progress_bar);
        progressBar4 = findViewById(R.id.d1_k4_progress_bar);

        buttonTest = findViewById(R.id.buttonTest2);


        setupProgressBar();

        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), KonuActivity.class));
                finish();
            }
        });

        progressBar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu2Activity.class));
                finish();
            }
        });

        progressBar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu3Activity.class));
                finish();
            }
        });

        progressBar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Konu4Activity.class));
                finish();
            }
        });

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Test2Activity.class));
            }
        });


    }

    private void setupProgressBar() {

        int dailyXp = 85;

        progressBar.setMax(dailyGoal);

        progressBar.setProgressWithAnimation(dailyXp, 2000);

        int dailyXpp = 45;

        progressBar2.setMax(dailyGoal);

        progressBar2.setProgressWithAnimation(dailyXpp, 2000);

        int dailyXp2 = 65;

        progressBar3.setMax(dailyGoal);

        progressBar3.setProgressWithAnimation(dailyXp2, 2000);

        int dailyXpp2 = 15;

        progressBar4.setMax(dailyGoal);

        progressBar4.setProgressWithAnimation(dailyXpp2, 2000);
    }

    /*
    * listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(), KonuActivity.class));
                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(), Konu2Activity.class));
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(), Konu3Activity.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(), Konu4Activity.class));
                }

            }
        });*/
}
