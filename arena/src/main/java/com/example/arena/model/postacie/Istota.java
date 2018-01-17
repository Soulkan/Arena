package com.example.arena.model.postacie;

import com.example.arena.model.wyposazenie.TypyBroniEnum;

import static com.example.arena.service.WalkaService.losuj;

public abstract class Istota implements FunkcjeIstoty {

    public Istota(Integer nowaSila, Integer nowaZwinnosc, Integer nowaWytrzymalosc, Integer nowaSzybkosc, Integer nowaInicjatywa, TypPostaciEnum nowyTypPostaci) {
        this.sila = nowaSila;
        this.zwinnosc = nowaZwinnosc;
        this.wytrzymalosc = nowaWytrzymalosc;
        this.szybkosc = nowaSzybkosc;
        this.inicjatywa = nowaInicjatywa;
        this.typPostaci = nowyTypPostaci;
    }

    private TypPostaciEnum typPostaci;

    public TypPostaciEnum getTypPostaci() {
        return typPostaci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private Integer sila;

    private Integer zwinnosc;

    public Integer getSila() {
        return sila;
    }

    public void setSila(Integer sila) {
        this.sila = sila;
    }

    public Integer getZwinnosc() {
        return zwinnosc;
    }

    public void setZwinnosc(Integer zwinnosc) {
        this.zwinnosc = zwinnosc;
    }

    public Integer getWytrzymalosc() {
        return wytrzymalosc;
    }

    public void setWytrzymalosc(Integer wytrzymalosc) {
        this.wytrzymalosc = wytrzymalosc;
    }

    public Integer getSzybkosc() {
        return szybkosc;
    }

    public void setSzybkosc(Integer szybkosc) {
        this.szybkosc = szybkosc;
    }

    public Integer getInicjatywa() {
        return inicjatywa;
    }

    public void setInicjatywa(Integer inicjatywa) {
        this.inicjatywa = inicjatywa;
    }

    private Integer wytrzymalosc;

    private Integer szybkosc;

    private Integer inicjatywa;

    @Override
    public String toString() {
        return "name: " + name + " sila: " + sila + " zwinnosc: " + zwinnosc + " wytrzymalosc: " + wytrzymalosc + " szybkosc: " + szybkosc
                + " inicjatywa: " + inicjatywa + " Typ postaci: " + getTypPostaci();
    }

    @Override
    public boolean uderz(Istota targetInnaIstota, TypyBroniEnum bronBiala) {
        if (getName().equals(targetInnaIstota.getName())) {
            System.out.println("Nie moge sam siebie uderzyc");
            return false;
        } else {
            if (getZwinnosc() > targetInnaIstota.getZwinnosc()) {
                System.out.println("Postac " + targetInnaIstota.getName() + " zostala uderzona przez postac " + getName() + " za pomoca " + bronBiala.name());
                return true;
            } else {
                System.out.println("Postac " + getName() + " nie trafiła postaci " + targetInnaIstota.getName());
                return false;
            }
        }
    }

    @Override
    public boolean strzel(Istota targetInnaIstota, TypyBroniEnum bronStrzelecka) {
        System.out.println("Postac " + getName() + " strzelila do " + targetInnaIstota.getName() + " za pomoca " + bronStrzelecka.name());
        return true;
    }

    @Override
    public boolean unik(Istota targetInnaIstota, TypyBroniEnum bron) {
        if (getInicjatywa() > targetInnaIstota.getInicjatywa()) {
            System.out.println("Postac " + getName() + " uniknela ciosu.");
            return true;
        } else {
            int obrazenia = losuj(bron.getObrazeniaMin(), bron.getObrazeniaMax());
            System.out.println("Postac " + getName() + " nie uniknela ciosu. I dostała obrazenia = " + obrazenia);
            if (obrazenia > getWytrzymalosc()) {
                System.out.println(getName() + " w wyniku poniesionych obrazen nie zyje.");
            } else {
                int rezultatObrazen = getWytrzymalosc() - obrazenia;
                System.out.println("W wyniku poniesionych obrazen " + getName() + " pozostalo " + rezultatObrazen + " punktow zycia");
            }
            return false;
        }
    }
}