package com.example.trafik.Ders1.Konular.Konu1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.trafik.R;

public class AltıncıFragment extends Fragment {
    TextView textView;
    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_altinci_konu,container,false);
        textView = rootView.findViewById(R.id.textViewAF);

        textView.setText("ERİŞME KONTROLLÜ KARAYOLU (Otoyol – Ekspresyol) : Özellikle rtansit trafiğe tahsis edilen, belirli yerle ve şartlar dışında giriş ve çıkışın yasaklandığı," +
                "yaya, hayvan ve motorsuz araçların giremediği, ancak izinli motorlu araçların yararlandığı ve trafiğin özel kontrola tabi tutulduğu karayoludur.");
        return rootView;
    }
}
