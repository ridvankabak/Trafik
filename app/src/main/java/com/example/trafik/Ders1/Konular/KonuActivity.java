package com.example.trafik.Ders1.Konular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
import com.example.trafik.R;

public class KonuActivity extends AppCompatActivity {
    ImageView imageViewNext,imageViewBack,imageViewHome;
    int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu);

        imageViewNext = findViewById(R.id.imageViewNext);
        imageViewBack = findViewById(R.id.imageViewBack);
        imageViewHome = findViewById(R.id.imageViewhome);


         FragmentManager fm = getSupportFragmentManager();
         FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.fragmentTutucu,new BirinciFragment());

        ft.commit();

        imageViewNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count==1){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new IkinciFragment());
                    ft.commit();

                }
                if(count==2){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new UcuncuFragment());
                    ft.commit();

                }
                if(count==3){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new DorduncuFragment());
                    ft.commit();

                }
                if(count==4){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new BesinciFragment());
                    ft.commit();

                }
                if(count==5){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new AltıncıFragment());
                    ft.commit();

                }
                if(count==6){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new YedinciFragment());
                    ft.commit();

                }
                if(count>=7){
                    count=7;
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new SekizciFragment());
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

                    ft.replace(R.id.fragmentTutucu,new BirinciFragment());
                    ft.commit();
                }
                if(count==1){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new IkinciFragment());
                    ft.commit();

                }
                if(count==2){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new UcuncuFragment());
                    ft.commit();

                }
                if(count==3){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new DorduncuFragment());
                    ft.commit();

                }
                if(count==4){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new BesinciFragment());
                    ft.commit();

                }
                if(count==5){

                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new AltıncıFragment());
                    ft.commit();

                }
                if(count==6){
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                    ft.replace(R.id.fragmentTutucu,new YedinciFragment());
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
