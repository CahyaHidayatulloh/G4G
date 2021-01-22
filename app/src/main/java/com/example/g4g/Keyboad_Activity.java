package com.example.g4g;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Keyboad_Activity extends AppCompatActivity {
    RecyclerView RecyclerKeyboard;
    AdapterKeyboard adapterKeyboard;
    List<keyboard> keyboardList;
    FloatingActionButton fabSwitcher;
    boolean isDark = false;
    ConstraintLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboad_);
        getSupportActionBar().hide();
        RecyclerKeyboard = findViewById(R.id.keyboard_rv);
        fabSwitcher = findViewById(R.id.fab_switcher);
        rootLayout = findViewById(R.id.ektipiti_keyboard);
        isDark = getThemeStatePref();
        if (isDark) {
            // dark theme is on
            rootLayout.setBackgroundColor(getResources().getColor(R.color.black));

        } else {
            // light theme is on
            rootLayout.setBackgroundColor(getResources().getColor(R.color.white));

        }
        keyboardList = new ArrayList<>();
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard1),getString(R.string.deskripsi_keyboard1),R.drawable.keyboard1));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard2),getString(R.string.deskripsi_keyboard2),R.drawable.keyboard2));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard3),getString(R.string.deskripsi_keyboard3),R.drawable.keyboard3));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard4),getString(R.string.deskripsi_keyboard4),R.drawable.keyboard4));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard5),getString(R.string.deskripsi_keyboard5),R.drawable.keyboard5));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard6),getString(R.string.deskripsi_keyboard6),R.drawable.keyboard6));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard7),getString(R.string.deskripsi_keyboard7),R.drawable.keyboard7));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard8),getString(R.string.deskripsi_keyboard8),R.drawable.keyboard8));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard9),getString(R.string.deskripsi_keyboard9),R.drawable.keyboard9));
        keyboardList.add(new keyboard(getString(R.string.nama_keyboard10),getString(R.string.deskripsi_keyboard10),R.drawable.keyboard10));

        fabSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDark = !isDark;

                if (isDark) {
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.black));

                }

                else {
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.white));

                }

                adapterKeyboard = new AdapterKeyboard(getApplicationContext(), keyboardList, isDark);

                RecyclerKeyboard.setAdapter(adapterKeyboard);
                saveThemeStatePref(isDark);
                ektipitiShow();
            }
        });

        ektipitiShow();
    }
    private void saveThemeStatePref(boolean isDark) {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isDark",isDark);
        editor.commit();
    }

    private boolean getThemeStatePref () {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        boolean isDark = pref.getBoolean("isDark",false) ;
        return isDark;
    }
    private void ektipitiShow(){
        adapterKeyboard = new AdapterKeyboard(this,keyboardList, isDark);
        RecyclerKeyboard.setAdapter(adapterKeyboard);
        RecyclerKeyboard.setLayoutManager(new LinearLayoutManager(this));
    }
}