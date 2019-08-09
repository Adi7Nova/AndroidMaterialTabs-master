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

public class segitiga extends AppCompatActivity {
    private Toolbar toolbar;
    EditText alas;
    EditText tinggi;
    Button luas;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        alas = findViewById(R.id.alas);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.hasil);
        luas = findViewById(R.id.luas);
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka11 = alas.getText().toString();
                String angka22 = tinggi.getText().toString();
                if (angka11.equalsIgnoreCase("") && angka11.trim().isEmpty() || angka22.equalsIgnoreCase("") && angka22.trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan Angka", Toast.LENGTH_LONG).show();
                } else {
                    double change1 = Double.parseDouble(alas.getText().toString());
                    double change2 = Double.parseDouble(tinggi.getText().toString());
                    double r = (change1 * change2 / 2);
                    hasil.setText(Double.toString(r));
                }
            }
        });
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
