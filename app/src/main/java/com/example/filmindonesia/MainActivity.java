package com.example.filmindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.danur1, R.drawable.gr, R.drawable.sing, R.drawable.mod, R.drawable.gun};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.judul_film);
        s2 = getResources().getStringArray(R.array.deskripsi);

        AdapterData adapterData = new AdapterData(this, s1, s2, images);
        recyclerView.setAdapter(adapterData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    }