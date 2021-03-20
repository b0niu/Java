package zad1;

public class QuickSort implements sortStrategy{

    int[] tab;

    public QuickSort(int[] t){
        tab=t;
    }

    int partition( int low, int high)
    {
        int pivot = tab[high];
        int i = (low-1),temp; // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (tab[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        temp = tab[i+1];
        tab[i+1] = tab[high];
        tab[high] = temp;

        return i+1;
    }

    void sortquick(int low, int high)
    {
        if (low < high)
        {
            int pi = partition( low, high);

            // Recursively sort elements before
            // partition and after partition
            sortquick(low, pi-1);
            sortquick(pi+1, high);
        }
    }

    @Override
    public int[] sort() {
        sortquick(0, tab.length-1);
        return tab;
    }
}
