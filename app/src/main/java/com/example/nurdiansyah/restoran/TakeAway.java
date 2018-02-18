package com.example.nurdiansyah.restoran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TakeAway extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_away);

    }

    public void pilihPS(View view) {

        Intent tekan = new Intent(TakeAway.this, DaftarMenu.class);
        startActivity(tekan);


    }
}
