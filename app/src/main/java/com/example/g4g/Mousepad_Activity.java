package com.example.g4g;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mousepad_Activity extends AppCompatActivity {
    RecyclerView RecyclerMousepad;
    AdapterMousepad adapterMousepad;
    List<Mousepad> mousepadList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mousepad_);
        getSupportActionBar().hide();
        RecyclerMousepad = findViewById(R.id.mousepad_rv);
        mousepadList = new ArrayList<>();
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad1),getString(R.string.deskripsi_mousepad1),R.drawable.mousepad1));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad2),getString(R.string.deskripsi_mousepad2),R.drawable.mousepad2));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad3),getString(R.string.deskripsi_mousepad3),R.drawable.mousepad3));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad4),getString(R.string.deskripsi_mousepad4),R.drawable.mousepad4));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad5),getString(R.string.deskripsi_mousepad5),R.drawable.mousepad5));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad6),getString(R.string.deskripsi_mousepad6),R.drawable.mousepad6));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad7),getString(R.string.deskripsi_mousepad7),R.drawable.mousepad7));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad8),getString(R.string.deskripsi_mousepad8),R.drawable.mousepad8));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad9),getString(R.string.deskripsi_mousepad9),R.drawable.mousepad9));
        mousepadList.add(new Mousepad(getString(R.string.nama_mousepad10),getString(R.string.deskripsi_mousepad10),R.drawable.mousepad10));

        adapterMousepad = new AdapterMousepad(this,mousepadList);
        RecyclerMousepad.setAdapter(adapterMousepad);
        RecyclerMousepad.setLayoutManager(new LinearLayoutManager(this));
    }
}