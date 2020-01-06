package com.example.trafik.Ders1.Konular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.trafik.Ders1.Ders1Activity;
import com.example.trafik.Ders1.Konular.Konu3.BirinciFragmentK3;
import com.example.trafik.Ders1.Konular.Konu3.IkinciFragmentK3;
import com.example.trafik.Ders1.Konular.Konu3.UcuncuFragmentK3;
import com.example.trafik.Ders1.Konular.Konu4.BirinciFragmentK4;
import com.example.trafik.R;

public class Konu4Activity extends AppCompatActivity {
    ImageView imageViewNext,imageViewBack,imageViewHome;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu4);

        imageViewNext = findViewById(R.id.imageViewNextK3);
        imageViewBack= findViewById(R.id.imageViewBackK3);
        imageViewHome = findViewById(R.id.imageViewhome4);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.frameLayoutK4,new BirinciFragmentK4());

        ft.commit();

        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ders1Activity.class));
                finish();
            }
        });


    }
}
