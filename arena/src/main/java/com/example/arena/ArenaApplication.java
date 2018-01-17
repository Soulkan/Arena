package com.example.arena;

import com.example.arena.model.postacie.*;
import com.example.arena.model.wyposazenie.TypyBroniEnum;
import com.example.arena.service.TworzeniePostaciService;
import com.example.arena.service.WalkaService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ArenaApplication {

    public static void main(String[] args) {
        TworzeniePostaciService tps = new TworzeniePostaciService();
        Istota postac1 = tps.stworzIstote(TypPostaciEnum.CZLOWIEK);
        postac1.setName("Józek");
        Istota postac2 = tps.stworzIstote(TypPostaciEnum.ORK);
        postac2.setName("Morawiecki");
        Istota postac3 = tps.stworzIstote(TypPostaciEnum.KRASNOLUD);
        postac3.setName("Gienek");
        Istota postac4 = tps.stworzIstote(TypPostaciEnum.ELF);
        postac4.setName("Orlando");
        Istota postac5 = tps.stworzIstote(TypPostaciEnum.HALFING);
        postac5.setName("Kaczoras");
        Istota postac6 = tps.stworzIstote(TypPostaciEnum.TROLL);
        postac6.setName("Ziom");

        List<Istota> listaIstot = new ArrayList<>();
        listaIstot.add(postac1);
        listaIstot.add(postac2);
        listaIstot.add(postac3);
        listaIstot.add(postac4);
        listaIstot.add(postac5);
        listaIstot.add(postac6);
        WalkaService ws = new WalkaService();
        ws.prezentacja(listaIstot);
        boolean rezultatUderzenia = postac1.uderz(postac2, TypyBroniEnum.MIECZ);
        if(rezultatUderzenia == true) {
            postac2.unik(postac1, TypyBroniEnum.MIECZ);
        }
        rezultatUderzenia = postac1.strzel(postac5, TypyBroniEnum.LUK);
        if(rezultatUderzenia == true) {
            postac5.unik(postac1, TypyBroniEnum.LUK);
        }
    }
}
