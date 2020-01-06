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

public class YedinciFragment extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_yedinci_konu,container,false);
        textView = rootView.findViewById(R.id.textViewYF);

        textView.setText("GEÇİŞ YOLU : Araçların bir mülke girip çıkması için yapılmış olan karayolu üzerinde bulunan kısmıdır.");

        return rootView;
    }
}
