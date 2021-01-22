package com.example.g4g;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Headset_Activity extends AppCompatActivity {
    RecyclerView RecycleHeadset;
    AdapterHeadset adapterHeadset;
    List<headset> headsetList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headset_);
        getSupportActionBar().hide();
        RecycleHeadset = findViewById(R.id.headset_rv);
        headsetList = new ArrayList<>();
        headsetList.add(new headset(getString(R.string.nama_headset1),getString(R.string.deskripsi_headset1),R.drawable.headset1));
        headsetList.add(new headset(getString(R.string.nama_headset2),getString(R.string.deskripsi_headset2),R.drawable.headset2));
        headsetList.add(new headset(getString(R.string.nama_headset3),getString(R.string.deskripsi_headset3),R.drawable.headset3));
        headsetList.add(new headset(getString(R.string.nama_headset4),getString(R.string.deskripsi_headset4),R.drawable.headset4));
        headsetList.add(new headset(getString(R.string.nama_headset5),getString(R.string.deskripsi_headset5),R.drawable.headset5));
        headsetList.add(new headset(getString(R.string.nama_headset6),getString(R.string.deskripsi_headset6),R.drawable.headset6));
        headsetList.add(new headset(getString(R.string.nama_headset7),getString(R.string.deskripsi_headset7),R.drawable.headset7));
        headsetList.add(new headset(getString(R.string.nama_headset8),getString(R.string.deskripsi_headset8),R.drawable.headset8));
        headsetList.add(new headset(getString(R.string.nama_headset9),getString(R.string.deskripsi_headset9),R.drawable.headset9));
        headsetList.add(new headset(getString(R.string.nama_headset10),getString(R.string.deskripsi_headset10),R.drawable.headset10));

        adapterHeadset = new AdapterHeadset(this,headsetList);
        RecycleHeadset.setAdapter(adapterHeadset);
        RecycleHeadset.setLayoutManager(new LinearLayoutManager(this));
    }
}