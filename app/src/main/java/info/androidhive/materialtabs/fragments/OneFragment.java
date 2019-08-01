package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText angka1;
    EditText angka2;
    Button plus;
    Button minus;
    Button kali;
    Button divide;
    TextView hasil;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one, container, false);
        angka1=view.findViewById(R.id.angka1);
        angka2=view.findViewById(R.id.angka2);
        hasil=view.findViewById(R.id.hasil);
        plus=view.findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = angka1.getText().toString();
                String angka22 = angka2.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() || angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()){
                    Toast.makeText(view.getContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change1=Double.parseDouble(angka1.getText().toString());
                    double change2=Double.parseDouble(angka2.getText().toString());
                    double has= change1+change2;
                    hasil.setText(Double.toString(has));
                }
            }
        });
        minus=view.findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = angka1.getText().toString();
                String angka22 = angka2.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() || angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()){
                    Toast.makeText(view.getContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change1=Double.parseDouble(angka1.getText().toString());
                    double change2=Double.parseDouble(angka2.getText().toString());
                    double has= change1-change2;
                    hasil.setText(Double.toString(has));
                }
            }
        });
        kali=view.findViewById(R.id.kali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = angka1.getText().toString();
                String angka22 = angka2.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() || angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()){
                    Toast.makeText(view.getContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change1=Double.parseDouble(angka1.getText().toString());
                    double change2=Double.parseDouble(angka2.getText().toString());
                    double has= change1*change2;
                    hasil.setText(Double.toString(has));
                }
            }
        });
        divide=view.findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = angka1.getText().toString();
                String angka22 = angka2.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() || angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()){
                    Toast.makeText(view.getContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change1=Double.parseDouble(angka1.getText().toString());
                    double change2=Double.parseDouble(angka2.getText().toString());
                    double has= change1/change2;
                    hasil.setText(Double.toString(has));
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
