package csr;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Comparable<Vehicle> {
    String marka;
    String model;
    ItemCondition stan;
    double cena;
    int rok_produkcji;
    double przebieg;
    double poj_silnika;

    public Vehicle(String mar, String mo, ItemCondition st, double c, int rok, double pr, double sil){
        marka=mar;
        model=mo;
        stan=st;
        cena=c;
        rok_produkcji=rok;
        przebieg=pr;
        poj_silnika=sil;
    }

    Vehicle(){
        marka="Fiat";
        model="Uno";
        stan=ItemCondition.DAMAGED;
        cena=100;
        rok_produkcji=1998;
        przebieg=1000000;
        poj_silnika=1.0;
    }


    public void print(){
        System.out.println("Pojazd to "+marka+" "+model+" stan: "+stan);
        System.out.println("Cena to: "+cena+" Rok produkcji "+rok_produkcji+" Przebieg "+przebieg+" Pojemność "+poj_silnika);

    }

    public List<String> Info(){
        List<String> info = new ArrayList<>();
        info.add(marka+" "+model);
        info.add(String.valueOf("Stan "+stan));
        info.add(String.valueOf("Cena auta "+cena+"zł"));
        info.add(String.valueOf(rok_produkcji));
        info.add(String.valueOf("Przebieg "+przebieg));
        info.add(String.valueOf("Silnik "+poj_silnika));
        return info;

    }


    @Override
    public int compareTo(Vehicle o) {
        String nazwa1 = marka+" "+model;
        String nazwa2 = o.marka+" "+o.model;
        return nazwa1.compareTo(nazwa2);
    }

    public int compare(String nazwa_poj){
        return nazwa_poj.compareTo(marka+" "+model);
    }
}
