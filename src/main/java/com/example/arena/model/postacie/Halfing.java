package com.example.arena.model.postacie;

public class Halfing extends Istota {

    public Halfing(Integer sila, Integer zwinnosc, Integer wytrzymalosc, Integer szybkosc, Integer inicjatywa, Integer nowePunktyZycia) {
        super(sila, zwinnosc, wytrzymalosc, szybkosc, inicjatywa, TypPostaciEnum.HALFING, 1, 1, nowePunktyZycia);
    }
}
