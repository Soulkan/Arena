package com.example.arena.model.postacie;

/**
 * Created by lzaboklicki on 06.12.2017.
 */
public class Ork extends Istota {


    public Ork(Integer sila, Integer zwinnosc, Integer wytrzymalosc, Integer szybkosc, Integer inicjatywa, Integer nowePunktyZycia) {
        super(sila, zwinnosc, wytrzymalosc, szybkosc, inicjatywa, TypPostaciEnum.ORK, 1, nowePunktyZycia);
    }}
