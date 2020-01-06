package com.example.trafik.Ders1.Konular.Konu2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.trafik.R;

public class UcuncuFragmentK2 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu2_ucuncu_fragment,container,false);
        textView = rootView.findViewById(R.id.textViewUFK2);

        textView.setText("5) Yazılı ve sesli ışık: Araç trafiğine göre yaya trafiğini düzenler ve yayalara hitap eder.");

        return rootView;

    }
}
