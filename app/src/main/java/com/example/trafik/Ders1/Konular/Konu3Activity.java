package com.example.trafik.Ders1.Konular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trafik.Ders1.Ders1Activity;
import com.example.trafik.Ders1.Konular.Konu2.BirinciFragmentK2;
import com.example.trafik.Ders1.Konular.Konu2.IkinciFragmentK2;
import com.example.trafik.Ders1.Konular.Konu2.UcuncuFragmentK2;
import com.example.trafik.Ders1.Konular.Konu3.BirinciFragmentK3;
import com.example.trafik.Ders1.Konular.Konu3.IkinciFragmentK3;
import com.example.trafik.Ders1.Konular.Konu3.UcuncuFragmentK3;
import com.example.trafik.R;

import java.util.ArrayList;

public class Konu3Activity extends AppCompatActivity {
    ImageView imageViewNext,imageViewBack,imageViewHome;
    int count =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu3);

        imageViewNext = findViewById(R.id.imageViewNextK3);
        imageViewBack= findViewById(R.id.imageViewBackK3);
        imageViewHome = findViewById(R.id.imageViewhome3);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.frameLayoutK3,new BirinciFragmentK3());

        ft.commit();

        imageViewNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count==1){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK3,new IkinciFragmentK3());
                    ft.commit();

                }
                if(count>=2){
                    count=2;
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK3,new UcuncuFragmentK3());
                    ft.commit();

                }
            }
        });
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                if(count<=0){
                    count=0;
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK3,new BirinciFragmentK3());
                    ft.commit();

                }
                if(count==1){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK3,new IkinciFragmentK3());
                    ft.commit();

                }
                if(count==2){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK3,new UcuncuFragmentK3());
                    ft.commit();

                }
            }
        });
        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ders1Activity.class));
                finish();
            }
        });
    }
}
