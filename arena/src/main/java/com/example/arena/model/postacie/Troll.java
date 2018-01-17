package com.example.arena.model.postacie;

public class Troll extends Istota {

    public Troll(Integer sila, Integer zwinnosc, Integer wytrzymalosc, Integer szybkosc, Integer inicjatywa, Integer nowePunktyZycia) {
        super(sila, zwinnosc, wytrzymalosc, szybkosc, inicjatywa, TypPostaciEnum.TROLL, 1, nowePunktyZycia);
    }

}
