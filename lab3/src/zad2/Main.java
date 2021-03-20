package zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int n = 100,t=11;
        List<Integer> tab= new ArrayList<>();
        Random generator = new Random();

        for(int i =0;i<n;i++){
            tab.add( generator.nextInt(200)-100);
            System.out.print(tab.get(i)+",");
        }

        Spot s=new Spot(t,tab);
        s.spot();


    }
}
