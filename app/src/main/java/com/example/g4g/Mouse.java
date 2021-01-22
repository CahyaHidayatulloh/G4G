package com.example.g4g;

public class Mouse {
    String titleMouse, deskripisMouse;
    int foto_Mouse;

    public Mouse(String titleMouse, String deskripisMouse, int foto_Mouse) {
        this.titleMouse=titleMouse;
        this.deskripisMouse=deskripisMouse;
        this.foto_Mouse=foto_Mouse;
    }

    public String getTitleMouse() {
        return titleMouse;
    }

    public void setTitleMouse(String titleMouse) {
        this.titleMouse = titleMouse;
    }

    public String getDeskripisMouse() {
        return deskripisMouse;
    }

    public void setDeskripisMouse(String deskripisMouse) {
        this.deskripisMouse = deskripisMouse;
    }

    public int getFoto_Mouse() {
        return foto_Mouse;
    }

    public void setFoto_Mouse(int foto_Mouse) {
        this.foto_Mouse = foto_Mouse;
    }
}
