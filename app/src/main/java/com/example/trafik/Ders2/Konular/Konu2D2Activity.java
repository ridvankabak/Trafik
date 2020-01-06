package com.example.trafik.Ders2.Konular;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.trafik.Ders2.Ders2Activity;
import com.example.trafik.Ders2.Konular.Konu.D2BirinciFragment;
import com.example.trafik.Ders2.Konular.Konu2.D2K2BirinciFragment;
import com.example.trafik.R;

public class Konu2D2Activity extends AppCompatActivity {

    ImageView imageViewHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu2_d2);

        imageViewHome = findViewById(R.id.imageViewHome2);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.fragmentTutucuD2K2,new D2K2BirinciFragment());

        ft.commit();

        imageViewHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ders2Activity.class));
                finish();
            }
        });
    }
}
