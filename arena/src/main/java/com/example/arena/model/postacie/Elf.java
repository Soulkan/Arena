package com.example.arena.model.postacie;

public class Elf extends Istota {

    //public final static String ELF = "ELF";

    public Elf(Integer sila, Integer zwinnosc, Integer wytrzymalosc, Integer szybkosc, Integer inicjatywa) {
        super(sila, zwinnosc, wytrzymalosc, szybkosc, inicjatywa, TypPostaciEnum.ELF);
    }
}