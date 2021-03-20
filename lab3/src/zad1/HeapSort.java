package zad1;

public class HeapSort implements sortStrategy{

    int[] tab;

    public HeapSort(int[] t){
        tab=t;
    }

    void heapify( int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && tab[l] > tab[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && tab[r] > tab[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = tab[i];
            tab[i] = tab[largest];
            tab[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify( n, largest);
        }
    }

    public void sortheap()
    {
        int n = tab.length,temp;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify( n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>0; i--)
        {
            // Move current root to end
            temp = tab[0];
            tab[0] = tab[i];
            tab[i] = temp;

            // call max heapify on the reduced heap
            heapify( i, 0);
        }
    }

    @Override
    public int[] sort() {
        sortheap();
        return tab;
    }
}
