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

public class BirinciFragmentK2 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu2_birinci_fragment,container,false);

        textView=rootView.findViewById(R.id.textViewBFK2);

        textView.setText("1) Kırmızı ışık: Yolun trafiğe kapalı olduğunu gösterir. Aksine bir işaret yoksa, durup beklenir.\n" +
                "2) Sarı ışık: Uyarı anlamındadır. Kırmızı ışıkla birlikte yanarsa hazırlan yol trafiğe açılmak üzeredir. " +
                "Yeşil ışıkla birlikte yanarsa yol trafiğe kapanmak üzeredir.\n" +
                "3) Yeşil ışık: Yolun trafiğe açık olduğunu gösterir.\n");

        return rootView;
    }
}
