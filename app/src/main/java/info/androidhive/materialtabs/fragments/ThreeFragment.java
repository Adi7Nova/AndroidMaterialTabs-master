package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.balok;
import info.androidhive.materialtabs.activity.kubus;


public class ThreeFragment extends Fragment{
    Button kubus;
    Button balok;

    public ThreeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_three, container, false);
        kubus=view.findViewById(R.id.kubus);
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), kubus.class);
                startActivity(in);
            }
        });
        balok=view.findViewById(R.id.balok);
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), balok.class);
                startActivity(in);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
