package com.example.trafik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.trafik.Ders1.Ders1Activity;
import com.example.trafik.Ders2.Ders2Activity;
import com.example.trafik.Utils.CustomProgressBar;

public class DerslerActivity extends AppCompatActivity {
    int dailyGoal = 100;

    CustomProgressBar progressBar,progressBar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dersler);

        progressBar = findViewById(R.id.user_progress_bar);
        progressBar2=findViewById(R.id.user_progress_bar2);

        setupProgressBar();

        progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ders1Activity.class));
            }
        });

        progressBar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ders2Activity.class));
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
    }
}
