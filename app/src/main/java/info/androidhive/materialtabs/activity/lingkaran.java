package info.androidhive.materialtabs.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class lingkaran extends AppCompatActivity {
    private Toolbar toolbar;
    EditText angka1;
    Button keliling;
    Button luas;
    TextView hasil;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        angka1=findViewById(R.id.angka1);
        keliling=findViewById(R.id.keliling);
        hasil=findViewById(R.id.hasil);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = angka1.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change2=Double.parseDouble(angka1.getText().toString());
                    double r= (2*22*change2/7);
                    hasil.setText(Double.toString(r));
                }
            }
        });
        luas=findViewById(R.id.luas);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = angka1.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change2=Double.parseDouble(angka1.getText().toString());
                    double r= (22*change2*change2/7);
                    hasil.setText(Double.toString(r));
                }
            }
        });

    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
