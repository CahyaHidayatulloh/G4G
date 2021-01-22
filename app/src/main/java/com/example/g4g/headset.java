package com.example.g4g;

public class headset {
    String title_headset, deskripsi_headset;
    int foto_headset;

    public headset(String title_headset, String deskripsi_headset, int foto_headset) {
        this.title_headset=title_headset;
        this.deskripsi_headset=deskripsi_headset;
        this.foto_headset=foto_headset;
    }

    public String getTitle_headset() {
        return title_headset;
    }

    public void setTitle_headset(String title_headset) {
        this.title_headset = title_headset;
    }

    public String getDeskripsi_headset() {
        return deskripsi_headset;
    }

    public void setDeskripsi_headset(String deskripsi_headset) {
        this.deskripsi_headset = deskripsi_headset;
    }

    public int getFoto_headset() {
        return foto_headset;
    }

    public void setFoto_headset(int foto_headset) {
        this.foto_headset = foto_headset;
    }
}
