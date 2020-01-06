package com.example.trafik.Ders2.Konular.Konu5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.trafik.R;

public class D2K5BirinciFragment extends Fragment {
    Button buttonBas,buttonOmurga,buttonKarin,buttonGogus;
    TextView textViewTitle, textViewDescription;
    ImageView imageViewTitlePic;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.d2_k5_birinci_fragment,container,false);

        buttonBas = rootView.findViewById(R.id.buttonBas);
        buttonOmurga = rootView.findViewById(R.id.buttonOmurga);
        buttonKarin = rootView.findViewById(R.id.buttonKarin);
        buttonGogus = rootView.findViewById(R.id.buttonGogus);

        textViewTitle = rootView.findViewById(R.id.textViewTitle);
        textViewDescription = rootView.findViewById(R.id.textViewDescription);
        imageViewTitlePic = rootView.findViewById(R.id.imageViewTitlePic);

        textViewTitle.setText("");
        textViewDescription.setText("");

        buttonBas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTitle.setText("Baş");
                textViewDescription.setText("Baş, yaralanmalarında hastada bulantı ve kusma görülebilir.\n" +
                        "Göz bebeklerinde büyüklük fark vardır.Kanayan yer aşağı gelecek şekilde baş soğuk ama vücut sıcak tutulur. Soluk yolu\n" +
                        "açılarak en az 6 saat doktor gözetiminde tutulması gerekir.");
                imageViewTitlePic.setImageResource(R.drawable.bas);

            }
        });

        buttonOmurga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTitle.setText("Omurga");
                textViewDescription.setText("Omurga yaralanması veya kırıklarında hastada yara bölgesinin alt kısımlarında duyu kaybı vardır." +
                        "Hastaya sırt üstü düz yatış pozisyonu verilir." +
                        "Dikkatli taşınmaz ise hasta felç olabilir.");
                imageViewTitlePic.setImageResource(R.drawable.omurga);

            }
        });


        buttonKarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTitle.setText("Karın");
                textViewDescription.setText("Karın yaralanmalarında bu bölgede iç kanamadan dolayı sertlik görülür, hastaya sulu gıda verilmez, buz tatbik edilir. Hastaya verilecek pozisyon : yara yukarıdan aşağıya göre ise ayaklar birleştirilip sevk edilir.\n" +
                        "Yara Enine göre ise diz bükülerek sevk edilir. Dışarı çıkan organ varsa yerine yerleştirilir.");
                imageViewTitlePic.setImageResource(R.drawable.karin);

            }
        });

        buttonGogus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTitle.setText("Göğüs");
                textViewDescription.setText("Göğüs yaralanmalarında, akciğerlerin hava almaması için elle veya ıslak bezle kapatılır. Yabancı cisim varsa çıkartılmaz.Hasta oturuş veya yarı oturuş pozisyonunda sevk edilir.");
                imageViewTitlePic.setImageResource(R.drawable.gogus);

            }
        });

        return rootView;
    }
}
