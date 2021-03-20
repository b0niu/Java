package zad5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static zad5.Clock.printClock;

public class ExceptionTest {
    @Test
    public void MyExceptionTest(){
        assertThrows(MyException.class,() ->{
        int[][] tab = {{}};
        int[] tab1;
        if(tab.length ==0 || tab[0].length==0){
            throw new MyException("To nie macierz");
        }else{tab1=printClock(tab);}});
    }
}
