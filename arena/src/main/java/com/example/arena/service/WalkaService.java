package com.example.arena.service;

import com.example.arena.model.postacie.Istota;

import java.util.List;
import java.util.Random;

public class WalkaService {


    public void prezentacja(List<Istota> istoty){
        if(istoty.size() == 0){
            System.out.println("Nie ma postaci do walki");
        } else if (istoty.size() == 1){
            System.out.println("Stoje tu sam i nie ma z kim walczyc kur...");
        } else {
            istoty.forEach( istota -> System.out.println("W walce biora udział: " + istota.toString()));
        }
    }

    public static int losuj(int minimum, int maximum) {
        Random rn = new Random();
        return rn.nextInt(maximum - minimum + 1) + minimum;
    }
}
