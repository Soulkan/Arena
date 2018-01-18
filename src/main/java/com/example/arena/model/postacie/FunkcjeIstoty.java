package com.example.arena.model.postacie;

import com.example.arena.model.wyposazenie.TypyBroniEnum;

public interface FunkcjeIstoty {

    int uderz(Istota targetInnaIstota, TypyBroniEnum bronBiala);

    boolean strzel(Istota targetInnaIstota, TypyBroniEnum bronStrzelecka);

    void unik(Istota atakujacaIstota, int sumaObrazen);
}
