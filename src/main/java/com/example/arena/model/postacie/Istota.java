package com.example.arena.model.postacie;

import com.example.arena.model.wyposazenie.TypyBroniEnum;

import static com.example.arena.service.WalkaService.losuj;

public abstract class Istota implements FunkcjeIstoty {

    public Istota(Integer nowaSila, Integer nowaZwinnosc, Integer nowaWytrzymalosc, Integer nowaSzybkosc, Integer nowaInicjatywa, TypPostaciEnum nowyTypPostaci, Integer nowaIloscAtakow,
                  Integer nowaIloscUnikow, Integer nowePunktyZycia) {
        this.sila = nowaSila;
        this.zwinnosc = nowaZwinnosc;
        this.wytrzymalosc = nowaWytrzymalosc;
        this.szybkosc = nowaSzybkosc;
        this.inicjatywa = nowaInicjatywa;
        this.typPostaci = nowyTypPostaci;
        this.iloscAtakow = nowaIloscAtakow;
        this.iloscUnikow = nowaIloscUnikow;
        this.punktyZycia = nowePunktyZycia;
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

    private Integer punktyZycia;

    public Integer getPunktyZycia() {
        return punktyZycia;
    }

    public void setPunktyZycia(Integer punktyZycia) {
        this.punktyZycia = punktyZycia;
    }

    private Integer iloscAtakow;

    public Integer getIloscAtakow() {
        return iloscAtakow;
    }

    public void setIloscAtakow(Integer iloscAtakow) {
        this.iloscAtakow = iloscAtakow;
    }

    private Integer iloscUnikow;

    public Integer getIloscUnikow() {
        return iloscUnikow;
    }

    public void setIloscUnikow(Integer iloscUnikow) {
        this.iloscUnikow = iloscUnikow;
    }

    @Override
    public String toString() {
        return "name: " + name + " sila: " + sila + " zwinnosc: " + zwinnosc + " wytrzymalosc: " + wytrzymalosc + " szybkosc: " + szybkosc
                + " inicjatywa: " + inicjatywa + " punkty zycia " + getPunktyZycia() + " Typ postaci: " + getTypPostaci();
    }

    @Override
    public int uderz(Istota targetInnaIstota, TypyBroniEnum bronBiala) {
        int sumaObrazen = 0;
        if (getIloscAtakow() > 0) {
            if (getName().equals(targetInnaIstota.getName())) {
                System.out.println("Nie moge sam siebie uderzyc");
            } else {
                sumaObrazen = atakPrzeciwnika(targetInnaIstota, bronBiala, sumaObrazen);
            }
        } else {
            System.out.println("Postac " + getName() + " nie posiada atakow");
        }
        return sumaObrazen;
    }

    private int atakPrzeciwnika(Istota targetInnaIstota, TypyBroniEnum bronBiala, int sumaObrazen) {
        System.out.println("Postac " + getName() + " atakuje " + targetInnaIstota.getName());
        if (getZwinnosc() > targetInnaIstota.getZwinnosc()) {
            int obrazenia = losuj(bronBiala.getObrazeniaMin(), bronBiala.getObrazeniaMax());
            sumaObrazen = obrazenia + getSila();
        } else {
            System.out.println("Postac " + targetInnaIstota.getName() + " uniknela uderzenia od " + getName());
        }
        redukcjaAtakow();
        return sumaObrazen;
    }

    private void redukcjaAtakow() {
        setIloscAtakow(getIloscAtakow() - 1);
    }

    @Override
    public boolean strzel(Istota targetInnaIstota, TypyBroniEnum bronStrzelecka) {
        System.out.println("Postac " + getName() + " strzelila do " + targetInnaIstota.getName() + " za pomoca " + bronStrzelecka.name());
        return true;
    }

    @Override
    public void unik(Istota atakujacaIstota, int sumaObrazen) {
        if (getIloscUnikow() > 0) {
            System.out.println("Postac " + getName() + " posiada " + getIloscUnikow() + " unikow wiec postara sie uniknac ciosu od " + atakujacaIstota.getName());
            if (getInicjatywa() > atakujacaIstota.getInicjatywa()) {
                System.out.println("Postac " + getName() + " uniknela ataku ze strony " + atakujacaIstota.getName());
            } else {
                System.out.println("Unik postaci " + getName() + " nie udal sie");
                rezultatObrazen(atakujacaIstota, sumaObrazen);
            }
            redukcjaUnikow();
        } else {
            System.out.println("Postac " + getName() + " nie posiada unikow");
            rezultatObrazen(atakujacaIstota, sumaObrazen);
        }
    }

    private void redukcjaUnikow() {
        if (getPunktyZycia() > 0) {
            setIloscUnikow(getIloscUnikow() - 1);
            System.out.println("Postac " + getName() + " pozostalo " + getIloscUnikow() + " unikow");
        }
    }

    private void rezultatObrazen(Istota atakujacaIstota, int sumaObrazen) {
        int zadaneObrazenia = sumaObrazen - getWytrzymalosc();
        if (zadaneObrazenia > 0) {
            int rezultatUderzenia = redukcjaPunktowZycia(zadaneObrazenia);
            if (rezultatUderzenia > 0) {
                System.out.println("W wyniku poniesionych obrazen postaci " + getName() + " pozostalo " + rezultatUderzenia + " punktow zycia");
            } else {
                System.out.println("Postac " + atakujacaIstota.getName() + " smiertelnie ranila " + getName());
            }
        } else {
            System.out.println("Dzieki wytrzymalosci postac " + getName() + " odparla atak ze strony " + atakujacaIstota.getName());
        }
    }

    private int redukcjaPunktowZycia(int zadaneObrazenia) {
        setPunktyZycia(getPunktyZycia() - zadaneObrazenia);
        return getPunktyZycia();
    }
}
