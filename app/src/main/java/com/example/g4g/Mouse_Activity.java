package com.example.g4g;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mouse_Activity extends AppCompatActivity {
    RecyclerView RecyclerMouse;
    AdapterMouse adapterMouse;
    List<Mouse> mouseList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouse_);
        getSupportActionBar().hide();
        RecyclerMouse= findViewById(R.id.mouse_rv);
        mouseList = new ArrayList<>();
        mouseList.add(new Mouse(getString(R.string.nama_mouse1),getString(R.string.deskripsi_mouse1),R.drawable.mouse1));
        mouseList.add(new Mouse(getString(R.string.nama_mouse2),getString(R.string.deskripsi_mouse2),R.drawable.mouse2));
        mouseList.add(new Mouse(getString(R.string.nama_mouse3),getString(R.string.deskripsi_mouse3),R.drawable.mouse3));
        mouseList.add(new Mouse(getString(R.string.nama_mouse4),getString(R.string.deskripsi_mouse4),R.drawable.mouse4));
        mouseList.add(new Mouse(getString(R.string.nama_mouse5),getString(R.string.deskripsi_mouse5),R.drawable.mouse5));
        mouseList.add(new Mouse(getString(R.string.nama_mouse6),getString(R.string.deskripsi_mouse6),R.drawable.mouse6));
        mouseList.add(new Mouse(getString(R.string.nama_mouse7),getString(R.string.deskripsi_mouse7),R.drawable.mouse7));
        mouseList.add(new Mouse(getString(R.string.nama_mouse8),getString(R.string.deskripsi_mouse8),R.drawable.mouse8));
        mouseList.add(new Mouse(getString(R.string.nama_mouse9),getString(R.string.deskripsi_mouse9),R.drawable.mouse9));
        mouseList.add(new Mouse(getString(R.string.nama_mouse10),getString(R.string.deskripsi_mouse10),R.drawable.mouse10));

        adapterMouse = new AdapterMouse(this,mouseList);
        RecyclerMouse.setAdapter(adapterMouse);
        RecyclerMouse.setLayoutManager(new LinearLayoutManager(this));
    }
}