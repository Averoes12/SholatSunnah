package com.daff.sholatsunnah;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tahajjud, witir, rawatib, dhuha, istikhoroh, tahiyyatulMasjid, syuruq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajjud = findViewById(R.id.tahajjud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhoroh);
        tahiyyatulMasjid = findViewById(R.id.tahiyyatulMasjid);
        syuruq = findViewById(R.id.syuruq);

        tahajjud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyyatulMasjid.setOnClickListener(this);
        syuruq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tahajjud:
                Intent tahajjud = new Intent(MainActivity.this, Deskripsi.class);
                tahajjud.putExtra("sunnah", "https://wisatanabawi.com/sholat-tahajud/");
                startActivity(tahajjud);
                break;

            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("sunnah", "https://bersamadakwah.net/sholat-witir/");
                startActivity(witir);

                break;
            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("sunnah", "https://muslim.or.id/4602-tuntunan-shalat-sunnah-rawatib.html");
                startActivity(rawatib);

                break;
            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("sunnah", "https://muslim.or.id/44198-fikih-shalat-dhuha.html");
                startActivity(dhuha);
                break;
            case R.id.istikhoroh:
                Intent istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
                istikhoroh.putExtra("sunnah", "https://www.dream.co.id/orbit/tata-cara-shalat-istikharah-1811138.html");
                startActivity(istikhoroh);
                break;
            case R.id.tahiyyatulMasjid:
                Intent tahiyyatulMasjid = new Intent(MainActivity.this, Deskripsi.class);
                tahiyyatulMasjid.putExtra("sunnah", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                break;
            case R.id.syuruq:
                Intent syuruq = new Intent(MainActivity.this, Deskripsi.class);
                syuruq.putExtra("sunnah", "https://aitarus.com/sholat-syuruq-isyraq/");
                startActivity(syuruq);
                break;

        }
    }
}
