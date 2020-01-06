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

public class IkinciFragmentK3 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.konu3_ikinci_fragment,container,false);

        textView = rootView.findViewById(R.id.textViewIFK3);
        textView.setText("Kesik yol çizgileri: Trafik kurallarına uymak şartıyla sürücülerin, yol ve trafik durumuna uygun olduğunda, " +
                "öndeki araçları geçmek için şerit değiştirebileceğini gösterir.");

        return rootView;

    }
}
