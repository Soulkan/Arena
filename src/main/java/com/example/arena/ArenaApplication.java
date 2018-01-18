package com.example.arena;

import com.example.arena.model.postacie.Istota;
import com.example.arena.model.postacie.TypPostaciEnum;
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
        postac1.setName(TypPostaciEnum.CZLOWIEK.name());
        Istota postac2 = tps.stworzIstote(TypPostaciEnum.ORK);
        postac2.setName(TypPostaciEnum.ORK.name());
        Istota postac3 = tps.stworzIstote(TypPostaciEnum.KRASNOLUD);
        postac3.setName(TypPostaciEnum.KRASNOLUD.name());
        Istota postac4 = tps.stworzIstote(TypPostaciEnum.ELF);
        postac4.setName(TypPostaciEnum.ELF.name());
        Istota postac5 = tps.stworzIstote(TypPostaciEnum.HALFING);
        postac5.setName(TypPostaciEnum.HALFING.name());
        Istota postac6 = tps.stworzIstote(TypPostaciEnum.TROLL);
        postac6.setName(TypPostaciEnum.TROLL.name());

        List<Istota> listaIstot = new ArrayList<>();
        listaIstot.add(postac1);
        listaIstot.add(postac2);
        listaIstot.add(postac3);
        listaIstot.add(postac4);
        listaIstot.add(postac5);
        listaIstot.add(postac6);
        WalkaService ws = new WalkaService();
        ws.prezentacja(listaIstot);

        int rezultatUderzenia = postac4.uderz(postac5, TypyBroniEnum.MIECZ);
        if (rezultatUderzenia > 0) {
            postac5.unik(postac4, rezultatUderzenia);
        }
    }
}

