package com.example.nurdiansyah.restoran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DaftarMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_menu);
    }

    public void showayambakar(View view) {
        Intent tekan = new Intent(DaftarMenu.this, Detail.class);
        startActivity(tekan);
    }
}
