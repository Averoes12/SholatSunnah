package com.daff.sholatsunnah;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {
    //deklarasi webView

    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        //inisisalisasi

        webView = findViewById(R.id.webView);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");

        //agar javascript nya bisa terbaca
        webView.getSettings().setJavaScriptEnabled(true);
        //agar gambar nya automatis di masukkan
        webView.getSettings().setLoadsImagesAutomatically(true);
        //untuk memasukkan link nya
        webView.loadUrl(link);

    }
}
