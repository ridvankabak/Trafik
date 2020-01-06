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

public class IkinciFragment extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ikinci_konu,container,false);
        textView = rootView.findViewById(R.id.textViewIF);

        textView.setText("KARAYOLU (YOL) : Trafik için, kamunun yararlanmasına açık olan arazi şeridi, köprüler ve alanlardır");
        return rootView;
    }
}
