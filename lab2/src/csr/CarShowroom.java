package csr;

import java.util.ArrayList;
import java.util.*;

public class CarShowroom implements Comparable<CarShowroom> {
    String nazwa;
    List<Vehicle> listapoj=new ArrayList<>();;
    int pojemnosc;
    Map<String,Integer> ilosc_modeli= new LinkedHashMap<>();

    CarShowroom(String naz, int poj) {
        nazwa=naz;
        //List<Vehicle> listapoj = new ArrayList<>();
        pojemnosc=poj;
       // Map<String,Integer> ilosc_modeli = new LinkedHashMap<>();
    }


    public void addProduct(Vehicle poj){
        int il=1;
        if(listapoj.size() == pojemnosc){
            System.err.println("Brak miejsca");
        }
        else{
            for(Vehicle storedObject: listapoj){
                if(storedObject.compareTo(poj) == 0){
                    il++;
                }
            }
            listapoj.add(poj);
            ilosc_modeli.put(poj.marka+" "+poj.model,il);

        }
    }

    public void getProduct(Vehicle poj){
        if(ilosc_modeli.get(poj.marka+" "+poj.model)>1){
            int il=ilosc_modeli.get(poj.marka+" "+poj.model);
            //il--;
            //ilosc_modeli.put(poj.marka+" "+poj.model,il);
            ilosc_modeli.replace(poj.marka+" "+poj.model,il,il--);
        }else{
            ilosc_modeli.remove(poj.marka+" "+poj.model);
        }
        listapoj.remove(poj);
    }

    public void removeProduct(Vehicle poj){
        List<Vehicle> usuniete = new ArrayList<>();
        for(Vehicle storedObject: listapoj){
            if(storedObject.compareTo(poj) == 0){
                usuniete.add(storedObject);
            }
        }
        listapoj.removeAll(usuniete);
        ilosc_modeli.remove(poj.marka+" "+poj.model);


    }

    public Vehicle search(String nazw){
        //Vehicle zwroc = new Vehicle();
        for(Vehicle storedObject: listapoj){
            if(storedObject.compare(nazw) == 0){
                //storedObject.print();
                //return storedObject.Info();
                return storedObject;
            }
        }
        return null;
    }

    public void searchPartial(String n){
        for(Vehicle storedObject: listapoj){
            if(storedObject.marka.toLowerCase().contains(n.toLowerCase()) || storedObject.model.toLowerCase().contains(n.toLowerCase())){
                storedObject.print();
            }
        }

    }

    public void countByCondition(ItemCondition s){
        System.out.println("Wyszukiwanie pojazdów z "+nazwa+" o stanie "+s);


        for(Vehicle storedObject: listapoj){
            if(storedObject.stan.equals(s)){
               storedObject.print();
            }
        }

    }

    public void summary(){
        for(Vehicle storedObject: listapoj){
            storedObject.print();
            System.out.println(ilosc_modeli.get(storedObject.marka+" "+storedObject.model));
        }
    }

    public List<String> sortByName(){
        List<Vehicle> posortowana = new ArrayList<>(listapoj);
        Collections.sort(posortowana);
        Collections.reverse(posortowana);
        List<String> nazwy = new ArrayList<>();
        for(Vehicle cos1 :posortowana){
            nazwy.add(cos1.marka+" "+cos1.model);
        }
        return nazwy;

    }

    public List<String> getauta(){
        List<Vehicle> posortowana = new ArrayList<>(listapoj);
        Collections.sort(posortowana);
        List<String> nazwy = new ArrayList<>();
        for(Vehicle cos1 :posortowana){
            nazwy.add(cos1.marka+" "+cos1.model);
        }
        return nazwy;

    }

    public List<String> sortByAmount(){
        List<String> cos = new ArrayList<>();
        ilosc_modeli.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(map -> cos.add(map.getKey()));

//        for(String cos1: cos){
//            System.out.println(cos1);
//        }
        return cos;
    }
    public List<String> sortByAmount2(){
        List<String> cos = new ArrayList<>();
        ilosc_modeli.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(map -> cos.add(map.getKey()));

        Collections.reverse(cos);
        return cos;
    }

    public void max(){
        List<String> cos = new ArrayList<>();
        ilosc_modeli.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(map -> cos.add(map.getKey()));
        System.out.println(cos.get(0)+" "+ilosc_modeli.get(cos.get(0)));
    }

    @Override
    public int compareTo(CarShowroom o) {
        return nazwa.compareTo(o.nazwa);
    }
}
