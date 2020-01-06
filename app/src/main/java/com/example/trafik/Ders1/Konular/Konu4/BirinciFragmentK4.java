package com.example.trafik.Ders1.Konular.Konu4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.trafik.R;

public class BirinciFragmentK4 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu4_birinci_fragment,container,false);

        textView = rootView.findViewById(R.id.textViewBFK4);

        textView.setText("Erişme kontrollü karayolu:\n" +
                "Özellikle transit trafiğe tahsis edilen, belirli yerler ve şartlar dışında giriş ve çıkışın yasaklandığı, " +
                "yaya, hayvan ve motorsuz araçların giremediği, ancak izin verilen motorlu araçların yararlandığı ve trafiğin özel kontroletabi tutulduğu karayoludur.\n" +
                "Otoyola her yerden giriş veya çıkış yasaklanmıştır. " +
                "Buralara ancak özel yerlerden girilir veya çıkılır ki buralara girişte “hizalanma şeridi” çıkışta ise “yavaşlama şeridi” denir. " +
                "Duraklamak, park etmek, geri gitme, geri dönüş YASAKTIR.");

        return rootView;

    }
}
