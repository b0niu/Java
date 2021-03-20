package zad4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static zad4.Main.Triplet;

public class TripletTest {
    @Test
    public void checkingMaxTriplet() throws NoTripletException {
        int[] tab = {1,2,3,4};
        int sum = Triplet(tab);
        assertEquals(sum,9);
    }
}
