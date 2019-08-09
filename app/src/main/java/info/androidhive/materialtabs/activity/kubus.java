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

public class kubus extends AppCompatActivity {
    private Toolbar toolbar;
    EditText sisi;
    Button volume;
    Button luas;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        hasil=findViewById(R.id.hasil);
        sisi=findViewById(R.id.sisi);
        volume=findViewById(R.id.volume);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = sisi.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change2=Double.parseDouble(sisi.getText().toString());
                    double r= (change2*change2*change2);
                    hasil.setText(Double.toString(r));
                }
            }
        });
        luas=findViewById(R.id.luas);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = sisi.getText().toString();
                if(angka11.equalsIgnoreCase("") && angka11.trim().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Masukkan Angka",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double change2=Double.parseDouble(sisi.getText().toString());
                    double r= (6*(change2*change2));
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
