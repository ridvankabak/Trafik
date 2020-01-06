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

public class DorduncuFragment extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dorduncu_konu,container,false);

        textView = rootView.findViewById(R.id.textViewDF);

        textView.setText("TEK YÖNLÜ KARAYOLU : Taşıt yolunun yanlız bir yöndeki taşıt trafiği için kullanıldığı karayoludur.");

        return rootView;

    }
}
