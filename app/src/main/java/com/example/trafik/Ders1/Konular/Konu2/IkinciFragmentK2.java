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

public class IkinciFragmentK2 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu2_ikinci_fragment,container,false);

        textView = rootView.findViewById(R.id.textViewIFK2);
        textView.setText("4) Fasılalı ışık: Kırmızı ise dur, sarı ise dikkatli geç anlamındadır.");

        return rootView;

    }
}
