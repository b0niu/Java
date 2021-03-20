package zad1;

public class MargeSort implements sortStrategy{

    int[] tab;

    public MargeSort(int[] t){
        tab=t;
    }

    void merge(int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = tab[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = tab[m + 1 + j];


        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                tab[k] = L[i];
                i++;
            }
            else {
                tab[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            tab[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            tab[k] = R[j];
            j++;
            k++;
        }
    }

    void sortmerge( int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sortmerge(l, m);
            sortmerge(m + 1, r);

            // Merge the sorted halves
            merge( l, m, r);
        }
    }

    @Override
    public int[] sort() {
        sortmerge(0, tab.length-1);
        return tab;
    }
}
