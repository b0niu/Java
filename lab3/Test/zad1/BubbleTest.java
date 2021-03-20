package zad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class BubbleTest {
    int[] expect={1,2,3,4,9};
    @Test
    public void bubbleSortTest1() {
        Sort strategia=new Sort();
        int[] tab ={9,3,4,2,1};
        strategia.set(new BubbleSort(tab));
        strategia.print(tab);
        assertArrayEquals(tab,expect);

    }

}
