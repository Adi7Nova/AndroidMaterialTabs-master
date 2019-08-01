package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;


public class TwoFragment extends Fragment{
    Button lingkaran;
    Button pp;
    Button ll;
    Button segitiga;

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
        pp=view.findViewById(R.id.pp);
        ll=view.findViewById(R.id.ll);
        segitiga=view.findViewById(R.id.segitiga);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(TwoFragment.this, Lingkaran.class);
                startActivity(in);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
