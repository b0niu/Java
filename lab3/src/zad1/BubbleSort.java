package zad1;

public class BubbleSort implements sortStrategy{

    int[] tab;

    public BubbleSort(int[] t){
        tab=t;
    }

    public void sortbubble(){

        int temp,n= tab.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (tab[j] > tab[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
    }


    @Override
    public int[] sort() {
        sortbubble();
        return tab;
    }
}
