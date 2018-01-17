package com.example.arena.materialy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzaboklicki on 27.11.2017.
 */
public class LesniczyService {

    public void start() {

        Choinka firstChoinka = zrobChoinke("świerk", 150);
        Choinka secondChoinka = zrobChoinke("sosne", 200);

        List<Choinka> sklep = new ArrayList<>();
        sklep.add(firstChoinka);
        sklep.add(secondChoinka);

        firstChoinka = sklep.get(0);

        List<Bombka> pudło = new ArrayList<>();
        pudło.add(new Bombka("okragla", "kratka"));
        pudło.add(new Bombka("kwadrat", "pasy"));

        firstChoinka.setBombki(pudło);
        sklep.forEach(choinka -> {
            if (choinka.getBombki() != null & choinka.getBombki().size() > 0) {
                System.out.println("Mamy choinke gotowa a na niej bombki :");
                choinka.getBombki().forEach(bombka -> System.out.println("bombka ma ksztlat " + bombka.getKsztalt() + " oraz wzor : " + bombka.getWzor()));
            } else {
                System.out.println("Mamy choinke niegotowa ");
            }
        });
    }

    public Choinka zrobChoinke(String typDrzewa, Integer wysokosc) {
        return new Choinka(typDrzewa, wysokosc);
    }
}
