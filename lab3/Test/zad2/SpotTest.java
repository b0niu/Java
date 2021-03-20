package zad2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SpotTest {
    @Test
    public void DzielTest(){ // powinien znalezc
        int target = 8;
        List<Integer> tab =new ArrayList<>();
        tab.add(1);
        tab.add(4);
        tab.add(-2);
        tab.add(-4);
        tab.add(2);
        Spot n=new Spot(target,tab);
        int[] test = n.spot();
        assertTrue(test[1]!=0);
    }

    @Test
    public void BrakDzielTest(){ //nie ma dzielników
        int target = 8;
        List<Integer> tab =new ArrayList<>();
        tab.add(1);
        tab.add(5);
        tab.add(-3);
        tab.add(-9);
        tab.add(11);
        Spot n=new Spot(target,tab);
        int[] test = n.spot();
        assertFalse(test[1]!=0);
    }
    @Test
    public void JedenDzielTest(){  //jest  jeden
        int target = 16;
        List<Integer> tab =new ArrayList<>();
        tab.add(1);
        tab.add(4);
        tab.add(-2);
        tab.add(2);
        tab.add(2);
        Spot n=new Spot(target,tab);
        int[] test = n.spot();
        assertFalse(test[1]!=0);
    }
    @Test
    public void PierwszaTest(){  //liczba pierwsza
        int target = 11;
        List<Integer> tab =new ArrayList<>();
        tab.add(1);
        tab.add(4);
        tab.add(-2);
        tab.add(2);
        tab.add(2);
        Spot n=new Spot(target,tab);
        int[] test = n.spot();
        assertTrue( test[1]!=-1);
    }
}
