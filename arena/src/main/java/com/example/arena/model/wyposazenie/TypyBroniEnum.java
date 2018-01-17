package com.example.arena.model.wyposazenie;

/**
 * Created by lzaboklicki on 20.12.2017.
 */
public enum TypyBroniEnum {

    PIESC(0, 2),
    NOZ(1, 3),
    MIECZ(2, 5),
    TOPOR(2, 5),
    LUK(2,5),
    KUSZA(3,6),
    PROCA(1,3);


    TypyBroniEnum(int obrazeniaMin, int obrazeniaMax) {
        this.obrazeniaMin = obrazeniaMin;
        this.obrazeniaMax= obrazeniaMax;
    }

    private int obrazeniaMin;
    private int obrazeniaMax;


    public int getObrazeniaMin() {
        return obrazeniaMin;
    }

    public int getObrazeniaMax() {
        return obrazeniaMax;
    }
}