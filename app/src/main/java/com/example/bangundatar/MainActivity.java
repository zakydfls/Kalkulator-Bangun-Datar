package com.example.bangundatar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private Button btnTriangle, btnCircle, btnSquare;
    private EditText edtPanjang, edtLebar;
    private TextView txtLuas, txtKel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Kalkulator Bangun Datar");
        btnTriangle = (Button) findViewById(R.id.triangle);
        btnCircle = (Button) findViewById(R.id.circle);
        btnSquare = (Button) findViewById(R.id.square);
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        txtLuas = (TextView) findViewById(R.id.txt_luas);
        txtKel = (TextView) findViewById(R.id.txt_kel);
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();
                if( edtPanjang.length() == 0 || edtLebar.length() == 0 ) {
                    Toast.makeText(view.getContext(),
                            "All field must be filled!", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    double p = Double.parseDouble(panjang) ;
                    double l = Double.parseDouble(lebar);
                    double luas = p * l;
                    double keliling = (2*p) + (2*l);
                    txtLuas.setText("Hasil Luas : " + luas +"\nRumus Luas : p * l");
                    txtKel.setText("Hasil Keliling : " + keliling + "\nRumus Keliling = (2*p) + (2*l)");
                }
            }

        });
        btnTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alas = edtPanjang.getText().toString().trim();
                String tinggi = edtLebar.getText().toString().trim();
                if( edtPanjang.length() == 0 || edtLebar.length() == 0) {
                    Toast.makeText(view.getContext(),
                            "All field must be filled!", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    double a =Double.parseDouble(alas);
                    double t =Double.parseDouble(tinggi);
                    double luas = 0.5 * a * t;
                    double keliling = a + a + a;
                    txtLuas.setText("Hasil Luas : " + luas + "\nRumus Luas : 0.5 * a * t");
                    txtKel.setText("Hasil Keliling : " + keliling + "\nRumus Keliling : a + a + a");
                }
            }
        });
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String diameter = edtPanjang.getText().toString().trim();
                if( edtPanjang.length() == 0) {
                    Toast.makeText(view.getContext(),
                            "Diameter field must be filled!", Toast.LENGTH_SHORT).show();
                    return;
                } else{
                    double d = Double.parseDouble(diameter);
                    double luas = 0.25 * 3.14 * d * d;
                    double keliling = 3.14 * d;
                    txtLuas.setText("Hasil Luas : " + luas + "\nRumus Luas : 1/4 * π * d * d ");
                    txtKel.setText("Hasil Keliling : " + keliling + "\nRumus Keliling : π * d ");
                }
            }
        });
    }
}