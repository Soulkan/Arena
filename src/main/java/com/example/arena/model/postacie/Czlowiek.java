package com.example.arena.model.postacie;

public class Czlowiek extends Istota {

    public Czlowiek(Integer nowaSila, Integer nowaZwinnosc, Integer nowaWytrzymalosc, Integer nowaSzybkosc, Integer nowaInicjatywa, Integer nowePunktyZycia) {
        super(nowaSila, nowaZwinnosc, nowaWytrzymalosc, nowaSzybkosc, nowaInicjatywa, TypPostaciEnum.CZLOWIEK, 1, 1, nowePunktyZycia);
    }
}
