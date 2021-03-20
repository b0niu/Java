package csr;

import java.util.*;

public class CarShowroomContainer {
    Map<String, CarShowroom> salony = new LinkedHashMap<String, CarShowroom>();
    List<CarShowroom> nazwy = new LinkedList<>();

    CarShowroomContainer(){ }

    public CarShowroom addCenter(String n, int i){
       CarShowroom salon = new CarShowroom(n,i);
        salony.put(n,salon);
        nazwy.add(salon);
        return salon;
    }

    public void removeCenter(String n){
        System.out.println("Zostanie usuniety: "+n);
        salony.remove(n);
    }

    public void findEmpty(){
        System.out.println("Pyste salony to: ");
        for(CarShowroom puste: salony.values()){
            if(puste.listapoj.size() == 0){
                System.out.println(puste.nazwa);
            }
        }
    }

    public List<String> sort(){

        List<String> nazwSort = new LinkedList<>();
       nazwy.sort(comparator);
        for(CarShowroom c: nazwy){
            nazwSort.add(c.nazwa);
            //System.out.println(nazwSort);
        }
        //System.out.println(nazwSort);

        return nazwSort;
    }

    public void summary(){
        double zapel;
        for(CarShowroom znal: salony.values()){
            zapel=znal.listapoj.size()/ (double)znal.pojemnosc;
            zapel*=100;
            System.out.println(znal.nazwa+" jest zapełniony w "+zapel+"%");
        }

    }

    public List<String> getNazwy() {
        List<String> cos = new ArrayList<>();
        salony.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.<String, CarShowroom>comparingByValue())).forEachOrdered(map -> cos.add(map.getKey()));

        return cos;


    }

    public List<String> getCars(String sal) {
        CarShowroom salon= salony.get(sal);
        List<String> cos = salon.getauta();
        //salon.ilosc_modeli.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEachOrdered(map -> cos.add(map.getKey()));

        return cos;

    }

    Comparator<CarShowroom> comparator=new Comparator<CarShowroom>() {
        @Override
        public int compare(CarShowroom o1, CarShowroom o2) {
            return Integer.compare(o2.listapoj.size(),o1.listapoj.size());
        }
    };

    public CarShowroom getSalon(String sal) {
        return salony.get(sal);
    }
}
