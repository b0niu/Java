package zad2;


import java.util.ArrayList;
import java.util.List;

public class Spot {
    List<Integer> a;
    int target;
    //List<Integer> dziel_target= new ArrayList<>();

    public Spot(int t ,List<Integer> tab){
        a=tab;
        target=t;
    }



    public int[] spot(){

        int[] dziel={0,0};
        List<Integer> dziel_target= new ArrayList<>();
        //SZUKANIE DZIELNIKÓW
        for(int i=1; i<target;i++){
            if(target%i==0){
                dziel_target.add(i);
                dziel_target.add(-i);
            }
        }

        List<Integer> znal = new ArrayList<>();

        for(int szuk: a){
            if(dziel_target.contains(szuk)){
                znal.add(szuk);
            }
        }

        if(znal.isEmpty()){
            System.out.println("\nNie ma dzielników");
            dziel[0]=-1;
            dziel[1]=-1;
            //return dziel;
        }
        else{
            //int dziel1=0,dziel2=0;
            for(int i: znal){
            dziel[0]=i;
                if(znal.contains(target/dziel[0])){
                    if(i==target/dziel[0]){continue;}
                    else{dziel[1] = target/dziel[0];
                        break;
                }

            }
        }
            if(dziel[1]==0){
                System.out.println("\nNie znaleziono dzielników");

            }else{
                //System.out.println("\n("+dziel1+" ; "+dziel2+")");
            }

    }
        return dziel;
}

}
