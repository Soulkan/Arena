package com.example.arena.materialy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzaboklicki on 27.11.2017.
 */
public class Choinka {

    private String typDrzewa;

    public String getTypDrzewa() {
        return typDrzewa;
    }

    public Integer getWysookosc() {
        return wysookosc;
    }

    private Integer wysookosc;

    public List<Bombka> getBombki() {
        return bombki;
    }

    public void setBombki(List<Bombka> bombki) {
        this.bombki = bombki;
    }

    private List<Bombka> bombki = new ArrayList<>();

    public Choinka(String podanyTypDrzewa, Integer podanaWysookosc){
        this.typDrzewa = podanyTypDrzewa;
        this.wysookosc = podanaWysookosc;
    }

}
