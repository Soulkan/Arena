package com.example.arena.service;

import com.example.arena.model.postacie.*;

import static com.example.arena.service.WalkaService.losuj;

public class TworzeniePostaciService {

    public Istota stworzIstote(TypPostaciEnum typPostaci) {
        if (typPostaci.equals(TypPostaciEnum.CZLOWIEK)) {
            return new Czlowiek(losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10));
        } else if (typPostaci.equals(TypPostaciEnum.ORK)) {
            return new Ork(losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10));
        } else if (typPostaci.equals(TypPostaciEnum.KRASNOLUD)) {
            return new Krasnolud(losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10));
        } else if (typPostaci.equals(TypPostaciEnum.ELF)) {
            return new Elf(losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10));
        } else if (typPostaci.equals(TypPostaciEnum.HALFING)) {
            return new Halfing(losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10));
        } else if (typPostaci.equals(TypPostaciEnum.TROLL)) {
            return new Troll(losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10), losuj(1, 10));
        }else
            return null;
    }
}
