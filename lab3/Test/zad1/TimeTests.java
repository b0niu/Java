package zad1;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeTests {
    Sort strat=new Sort();
    @Test
    public void quickSortTime()  {

        int[] tab ={9,3,4,2,1,5};

        strat.set(new QuickSort(tab));
        assertTimeout(Duration.ofMillis(5),()->strat.print(tab));
    }

    @Test
    public void mergeSortTime()  {

        int[] tab ={9,3,4,2,1,5};

        strat.set(new MargeSort(tab));
        assertTimeout(Duration.ofMillis(5),()->strat.print(tab));
    }

    @Test
    public void bubbleSortTime()  {

        int[] tab ={9,3,4,2,1,5};

        strat.set(new BubbleSort(tab));
        assertTimeout(Duration.ofMillis(5),()->strat.print(tab));
    }

    @Test
    public void heapSortTime() {

        int[] tab ={9,3,4,2,1,5};

        strat.set(new HeapSort(tab));
        assertTimeout(Duration.ofMillis(5),()->strat.print(tab));
    }

    @Test
    public void selectionSortTime()  {

        int[] tab ={9,3,4,2,1,5};

        strat.set(new SelectionSort(tab));
        assertTimeout(Duration.ofMillis(5),()->strat.print(tab));
    }

}
