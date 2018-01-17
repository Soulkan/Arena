package com.example.arena.model.postacie;

import com.example.arena.model.wyposazenie.TypyBroniEnum;

public interface FunkcjeIstoty {
    boolean uderz (Istota targetInnaIstota, TypyBroniEnum bronBiala);
    boolean strzel (Istota targetInnaIstota, TypyBroniEnum bronStrzelecka);
    boolean unik(Istota targetInnaIstota, TypyBroniEnum bron);
}
