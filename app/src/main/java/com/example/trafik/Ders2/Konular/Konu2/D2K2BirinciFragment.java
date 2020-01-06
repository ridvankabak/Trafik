package com.example.trafik.Ders2.Konular.Konu2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.trafik.R;

public class D2K2BirinciFragment extends Fragment {
    TextView textViewBas,textViewOmuz,textViewElveKol,textViewAyakveBacak,textViewTurnike;
    Button buttonBas,buttonOmuz,buttonElveKol, buttonAyakveBacak,buttonTurnike;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.d2_k2_birinci_fragment,container,false);

        textViewBas = rootView.findViewById(R.id.textViewBas);
        textViewOmuz = rootView.findViewById(R.id.textViewOmuz);
        textViewElveKol = rootView.findViewById(R.id.textViewElveKol);
        textViewAyakveBacak = rootView.findViewById(R.id.textViewAyakveBacak);
        textViewTurnike = rootView.findViewById(R.id.textViewTurnike);

        buttonBas = rootView.findViewById(R.id.buttonBas);
        buttonOmuz = rootView.findViewById(R.id.buttonOmuz);
        buttonElveKol = rootView.findViewById(R.id.buttonElveKol);
        buttonAyakveBacak = rootView.findViewById(R.id.buttonAyakveBacak);
        buttonTurnike = rootView.findViewById(R.id.buttonTurnike);

        buttonBas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewBas.setText("Baş derisi yaralanmalarında şakak kemiği üzerine basınç yapılır.");
            }
        });
        buttonOmuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewOmuz.setText("Omuz bölgesinde ise basınç uygulanacak bölge köprücük kemiği arka iç kısmıdır.");
            }
        });

        buttonElveKol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewElveKol.setText("El ve koldaki kanamalarda basınç yapılacak bölge koltuk altıdır.");
            }
        });

        buttonAyakveBacak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewAyakveBacak.setText("Ayak ve bacaktaki kanamalarda ise kasık iç kısmına basınç yapılır." +
                        " Kanayan yer basınçlı sargı bezi ile sıkıştırılır ve kalp seviyesinden yukarıda tutulur.\n");
            }
        });

        buttonTurnike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTurnike.setText("Sıkma bağı ile uygulama kanayan damarın turnike malzemesi ile sıkılmasıdır.\n" +
                        "El veya koldaki büyük bir kanamada turnike uygulanacak bölge dirsekle omuz arası,\n" +
                        "Bacaktaki kanamada ise turnike uygulanacak bölge diz ile kalça arasıdır. Bu uygulama 20 dakika aralıkla 5-10 saniye gevşetilir.\n" +
                        "Turnike malzemesi 5-6 cm. enindeki elastik bandaj malzemelerdir. Kravatta geçici turnike malzemesi olarak kullanılır.");
            }
        });







        return rootView;
    }
}
