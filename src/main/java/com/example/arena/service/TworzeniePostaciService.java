package com.example.arena.service;

import com.example.arena.model.postacie.Czlowiek;
import com.example.arena.model.postacie.Elf;
import com.example.arena.model.postacie.Halfing;
import com.example.arena.model.postacie.Istota;
import com.example.arena.model.postacie.Krasnolud;
import com.example.arena.model.postacie.Ork;
import com.example.arena.model.postacie.Troll;
import com.example.arena.model.postacie.TypPostaciEnum;

import static com.example.arena.service.WalkaService.losuj;

public class TworzeniePostaciService {

    public Istota stworzIstote(TypPostaciEnum typPostaci) {
        if (typPostaci.equals(TypPostaciEnum.CZLOWIEK)) {
            return new Czlowiek(losuj(1, 3), losuj(1, 5), losuj(2, 5), losuj(1, 3), losuj(2, 5), losuj(2, 5));
        } else if (typPostaci.equals(TypPostaciEnum.ORK)) {
            return new Ork(losuj(2, 4), losuj(1, 4), losuj(3, 5), losuj(1, 4), losuj(1, 4), losuj(3, 6));
        } else if (typPostaci.equals(TypPostaciEnum.KRASNOLUD)) {
            return new Krasnolud(losuj(3, 4), losuj(1, 4), losuj(3, 6), losuj(1, 3), losuj(1, 4), losuj(3, 6));
        } else if (typPostaci.equals(TypPostaciEnum.ELF)) {
            return new Elf(losuj(1, 3), losuj(3, 6), losuj(1, 5), losuj(2, 5), losuj(3, 6), losuj(2, 4));
        } else if (typPostaci.equals(TypPostaciEnum.HALFING)) {
            return new Halfing(losuj(1, 2), losuj(2, 6), losuj(1, 4), losuj(1, 3), losuj(2, 5), losuj(1, 3));
        } else if (typPostaci.equals(TypPostaciEnum.TROLL)) {
            return new Troll(losuj(3, 6), losuj(1, 3), losuj(3, 7), losuj(1, 3), losuj(1, 3), losuj(4, 8));
        } else {
            return null;
        }
    }
}
