package zad4;

import zad1.HeapSort;
public class Main {
    public static void main(String [] args) throws NoTripletException {
        int[] tab={-5,-7};
        HeapSort hs = new HeapSort(tab);
        tab=hs.sort();
        int suma;
        if(tab.length < 3){
            throw new NoTripletException("Za mała długość tablicy");
        }else
        {
            suma=Triplet(tab);
            System.out.println("Suma 3 największych wartości to: "+suma);
        }

    }

    public static int Triplet(int[] t){
        int suma =0;
        for(int i = t.length-3;i<t.length;i++){
            suma+=t[i];
        }

        return suma;

    }
}
