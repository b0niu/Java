package zad1;

public class SelectionSort implements sortStrategy{


    int[] tab;

    public SelectionSort(int[] t){
        tab=t;
    }

    void sortselection()
    {
        int n = tab.length,temp;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (tab[j] < tab[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            temp = tab[min_idx];
            tab[min_idx] = tab[i];
            tab[i] = temp;
        }
    }
    @Override
    public int[] sort() {
        sortselection();
        return tab;
    }
}
