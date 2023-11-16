package com.example.pruebaapi3;

public class Digimon {

    String Name;
    String level;

    String img;
    public Digimon(String name, String level, String img) {
        this.Name = name;
        this.level = level;
        this.img=img;
    }
    public void setName(String name) {
        Name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public String getLevel() {
        return level;
    }
    public String getImg(){
        return img;
    }
}
