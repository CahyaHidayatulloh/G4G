package com.example.g4g;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Objects;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        ImageView keyboard = findViewById(R.id.Keyboard);
    keyboard.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent keyboard = new Intent(MenuActivity.this, Keyboad_Activity.class);
            startActivity(keyboard);
        }
    });
        ImageView mouse = findViewById(R.id.Mouse);
    mouse.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mouse = new Intent(MenuActivity.this, Mouse_Activity.class);
            startActivity(mouse);
        }
    });
        ImageView headset = findViewById(R.id.Headset);
    headset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent headset = new Intent(MenuActivity.this, Headset_Activity.class);
            startActivity(headset);
        }
    });
        ImageView mousepad =  findViewById(R.id.Mousepad);
    mousepad.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent mousepad = new Intent(MenuActivity.this, Mousepad_Activity.class);
            startActivity(mousepad);
        }
    });
    }
}