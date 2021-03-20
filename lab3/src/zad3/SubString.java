package zad3;

public class SubString {
    String a;
    String b;

    public SubString(String a1, String b1){
        a=a1;
        b=b1;
    }


    public int substring(){

        int i=1;
        String n_a=a;
        while(!(n_a.contains(b))){

            n_a+=a;
            i++;
            if(i>100){
                System.out.println("string b nie może sie zawierać sie w wielokrotnisci a");
                i=-1;
                break;
            }
        }
        return i;
    }
}
