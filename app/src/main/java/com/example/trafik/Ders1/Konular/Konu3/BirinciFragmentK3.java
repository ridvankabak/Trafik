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

public class BirinciFragmentK3 extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu3_birinci_fragment, container, false);

        textView = rootView.findViewById(R.id.textViewBFK3);

        textView.setText("Devamlı yol çizgileri: İki şerit ve iki yönlü karayolunda, dönemeç tepe üstü, kavşak yaya ve okul geçidi, " +
                "demiryolu geçidi, dar köprü ve tünel gibi yerlerin yaklaşımında şerit değiştirilemeyeceğini ve öndeki araçların geçilemeyeceğini belirler.");

        return rootView;
    }
}
