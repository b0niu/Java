package zad4;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertThrows;


public class TriExceptionTest {
    @Test
    public void TripletExceptionTest(){
        assertThrows(NoTripletException.class,() ->{
            int[] tab = {1};
            if(tab.length < 3){
                throw new NoTripletException("Za mała długość tablicy");
            }
            });
    }
}
