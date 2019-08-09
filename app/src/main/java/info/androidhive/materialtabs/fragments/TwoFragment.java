package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.lingkaran;
import info.androidhive.materialtabs.activity.persegi;
import info.androidhive.materialtabs.activity.persegiPanjang;
import info.androidhive.materialtabs.activity.segitiga;


public class TwoFragment extends Fragment{
    CardView lingkaran;
    CardView pp;
    CardView ll;
    CardView segitiga;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two, container, false);
        lingkaran=view.findViewById(R.id.lingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), lingkaran.class);
                startActivity(in);
            }
        });
        pp=view.findViewById(R.id.pp);
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), persegiPanjang.class);
                startActivity(in);
            }
        });
        ll=view.findViewById(R.id.ll);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), persegi.class);
                startActivity(in);
            }
        });
        segitiga=view.findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent in=new Intent(getActivity(), segitiga.class);
                    startActivity(in);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
