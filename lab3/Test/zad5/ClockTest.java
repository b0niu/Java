package zad5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static zad5.Clock.printClock;

public class ClockTest {
    @Test
    public void clockwiseTest() throws MyException {
        int tab[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] printed=printClock(tab);;
        int[] expect ={1,4,7,8,9,6,3,2,5};
        boolean good=true;

        assertArrayEquals(printed,expect);;
    }

}
