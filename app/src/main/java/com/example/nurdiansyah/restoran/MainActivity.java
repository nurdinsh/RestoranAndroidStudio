package com.example.nurdiansyah.restoran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioGroup gg;
    private Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this, "Mohammad Nurdiansyah 1106130153", Toast.LENGTH_LONG);
        toast.show();

        gg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.TakeAway_id);
        rb2 = (RadioButton) findViewById(R.id.DineIn_id);
        pesan = (Button) findViewById(R.id.pesan_id);
    }

    public void PesanSekarang(View view) {
        if (rb1.isChecked()) {
        Toast.makeText(MainActivity.this, "Take Away", Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this, TakeAway.class);
        startActivity(i);
    } else if (rb2.isChecked()) {
        Toast.makeText(MainActivity.this, "Dine In", Toast.LENGTH_LONG).show();
        Intent b = new Intent(MainActivity.this, DineIn.class);
        startActivity(b);
    } else {
        Toast.makeText(MainActivity.this, "Blm Memilih", Toast.LENGTH_LONG).show();
    }

    }
}