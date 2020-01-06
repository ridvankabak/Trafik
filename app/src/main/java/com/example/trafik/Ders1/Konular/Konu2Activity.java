package com.example.trafik.Ders1.Konular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trafik.Ders1.Ders1Activity;
import com.example.trafik.Ders1.Konular.Konu1.AltıncıFragment;
import com.example.trafik.Ders1.Konular.Konu1.BesinciFragment;
import com.example.trafik.Ders1.Konular.Konu1.BirinciFragment;
import com.example.trafik.Ders1.Konular.Konu1.DorduncuFragment;
import com.example.trafik.Ders1.Konular.Konu1.IkinciFragment;
import com.example.trafik.Ders1.Konular.Konu1.SekizciFragment;
import com.example.trafik.Ders1.Konular.Konu1.UcuncuFragment;
import com.example.trafik.Ders1.Konular.Konu1.YedinciFragment;
import com.example.trafik.Ders1.Konular.Konu2.BirinciFragmentK2;
import com.example.trafik.Ders1.Konular.Konu2.IkinciFragmentK2;
import com.example.trafik.Ders1.Konular.Konu2.UcuncuFragmentK2;
import com.example.trafik.R;

public class Konu2Activity extends AppCompatActivity {
    ImageView imageViewNext,imageViewBack,imageViewHome;
    Button button;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu2);

        imageViewNext = findViewById(R.id.imageViewNextK2);
        imageViewBack = findViewById(R.id.imageViewBackK2);
        imageViewHome = findViewById(R.id.imageViewhome2);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.frameLayoutK2,new BirinciFragmentK2());

        ft.commit();

        imageViewNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count==1){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK2,new IkinciFragmentK2());
                    ft.commit();

                }
                if(count>=2){
                    count=2;
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK2,new UcuncuFragmentK2());
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

                    ft.replace(R.id.frameLayoutK2,new BirinciFragmentK2());
                    ft.commit();

                }
                if(count==1){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK2,new IkinciFragmentK2());
                    ft.commit();

                }
                if(count==2){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.frameLayoutK2,new UcuncuFragmentK2());
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
