package zad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HeapTest {
    int[] expect={1,2,3,4,9};
    @Test
    public void heapSortTest1(){
        Sort strategia=new Sort();
        int[] tab ={9,3,4,2,1};
        strategia.set(new HeapSort(tab));
        strategia.print(tab);
        assertArrayEquals(tab,expect);

    }
}
