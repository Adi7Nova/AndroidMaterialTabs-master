package info.androidhive.materialtabs.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class persegiPanjang extends AppCompatActivity {
    private Toolbar toolbar;
    EditText panjang;
    EditText lebar;
    Button keliling;
    Button luas;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        panjang=findViewById(R.id.panjang);
        lebar=findViewById(R.id.lebar);
        keliling=findViewById(R.id.keliling);
        luas=findViewById(R.id.luas);
        hasil=findViewById(R.id.hasil);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = panjang.getText().toString();
                String angka22 = luas.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() ||angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change1=Double.parseDouble(panjang.getText().toString());
                    double change2=Double.parseDouble(lebar.getText().toString());
                    double r= (2*change1)+(2*change2);
                    hasil.setText(Double.toString(r));
                }
            }
        });
        luas=findViewById(R.id.luas);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = panjang.getText().toString();
                String angka22 = luas.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() ||angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change1=Double.parseDouble(panjang.getText().toString());
                    double change2=Double.parseDouble(lebar.getText().toString());
                    double r= (change1*change2);
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
