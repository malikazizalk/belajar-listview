package com.uts.uts_aboutworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.uts.uts_aboutworld.news.HotNew;

public class TopikBeritaActivity extends AppCompatActivity {

    public final static String BERITA_HANGAT ="berita_topic_key";
    List<HotNew> hotnews;
    ListView listView;
    String topicBerita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topik_berita);
        Intent intent = getIntent();
        topicBerita = intent.getStringExtra(MainActivity.DAFTAR_BERITA_KEY);
        TextView txJudul = findViewById(R.id.text_title_berita);
        txJudul.setText("DAFTAR BERITA TENTANG "+topicBerita.toUpperCase());
        hotnews = BeritaSaatIni.getHotNewsByTipe(this,topicBerita);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_topic);
        TopikBeritaAdapter adapter = new TopikBeritaAdapter(this,hotnews);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            HotNew terpilih = hotnews.get(position);
            bukaBeritaSaatIni(terpilih);
        }
    };

    private void bukaBeritaSaatIni(HotNew topicHangat) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, HeaderActivity.class);
        intent.putExtra(BERITA_HANGAT, topicHangat);
        startActivity(intent);
    }
}