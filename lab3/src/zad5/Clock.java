package zad5;

public class Clock {
    public static void main(String [] args) throws MyException{
        int[]tab1;
        int[][] tab = {
                {1, 2, 3, 4, 5},
                { 6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        if(tab.length <1 || tab[0].length<1){
            throw new MyException("To nie macierz");
        }else{tab1=printClock(tab);}

        System.out.println(" ");
         for(int i=0; i < 25 ;i++){
             System.out.print(tab1[i] + " ");
         }

    }

    public static int [] printClock(int[][] tab)  {
        int n = tab.length;
        int m= tab[0].length;
        int t=0;
        int b=n-1;
        int l=0;
        int r=m-1;
        int [] cos = new int[n*m];
        int c = 0;

        while(b>=t && r>=l){
            for(int i=t; i<=b; i++){
                System.out.print(tab[i][l] + " ");
                cos[c]=tab[i][l];
                c++;
            }
            l++;
            for(int j=l;j<=r;j++){
                System.out.print(tab[b][j]+" ");
                cos[c]=tab[b][j];
                c++;
            }
            b--;
            for(int j=b;j>=t;j--){
                System.out.print(tab[j][r]+" ");
                cos[c]=tab[j][r];
                c++;
            }
            r--;
            for(int j=r;j>=l;j--){
                System.out.print(tab[t][j]+ " ");
                cos[c]=tab[t][j];
                c++;
            }
            t++;
        }
        return cos;

    }
}
