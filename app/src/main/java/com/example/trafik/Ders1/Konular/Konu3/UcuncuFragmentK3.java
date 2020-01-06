package com.example.trafik.Ders1.Konular.Konu3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.trafik.R;

public class UcuncuFragmentK3 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu3_ucuncu_fragment,container,false);
        textView = rootView.findViewById(R.id.textViewUFK3);

        textView.setText("Devamlı ve kesik yol çizgileri: Yanyana çizilmiş devamlı ve kesik yol çizgilerinin bulunduğu yerlerde sürücüler, " +
                "manevra başlangıcında kendilerine en yakın olan çizginin anlamına göre davranırlar");

        return rootView;

    }
}
