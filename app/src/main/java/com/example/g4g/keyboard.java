package com.example.g4g;

import android.widget.ImageView;

public class keyboard {
    String title_key, deskripsi_key;
    int foto_keyboard;

    public keyboard(String title_key, String deskripsi_key, int foto_keyboard) {
        this.title_key = title_key;
        this.deskripsi_key = deskripsi_key;
        this.foto_keyboard = foto_keyboard;
    }

    public void setTitle_key(String title_key) {
        this.title_key = title_key;
    }

    public void setDeskripsi_key(String deskripsi_key) {
        this.deskripsi_key = deskripsi_key;
    }

    public void setFoto_keyboard(int foto_keyboard) {
        this.foto_keyboard = foto_keyboard;
    }

    public String getTitle_key() {
        return title_key;
    }

    public String getDeskripsi_key() {
        return deskripsi_key;
    }

    public int getFoto_keyboard() {
        return foto_keyboard;
    }
}
