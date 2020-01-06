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

import org.w3c.dom.Text;

public class BesinciFragment extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_besinci_konu,container,false);

        textView=rootView.findViewById(R.id.textViewBF2);

        textView.setText("BÖLÜNMÜŞ KARAYOLU : Bir yöndeki trafiğe ait taşıt yolunun bir ayırıcı ile belirli şekilde diğer taşıt yolundan ayrılması ile meydana gelen karayoludur.");


        return rootView;
    }
}
