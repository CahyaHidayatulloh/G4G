package com.example.g4g;

public class Mousepad {
    String titleMousepad, des_mousepad;
    int foto_mousepad;

    public Mousepad(String titleMousepad, String des_mousepad, int foto_mousepad) {
        this.titleMousepad=titleMousepad;
        this.des_mousepad=des_mousepad;
        this.foto_mousepad=foto_mousepad;
    }

    public String getTitleMousepad() {
        return titleMousepad;
    }

    public void setTitleMousepad(String titleMousepad) {
        this.titleMousepad = titleMousepad;
    }

    public String getDes_mousepad() {
        return des_mousepad;
    }

    public void setDes_mousepad(String des_mousepad) {
        this.des_mousepad = des_mousepad;
    }

    public int getFoto_mousepad() {
        return foto_mousepad;
    }

    public void setFoto_mousepad(int foto_mousepad) {
        this.foto_mousepad = foto_mousepad;
    }
}
