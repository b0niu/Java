package zad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeTest {
    int[] expect={1,2,3,4,9};
    @Test
    public void mergeSortTest()  {
        Sort strategia=new Sort();
        int[] tab ={9,3,4,2,1};
        strategia.set(new MargeSort(tab));
        strategia.print(tab);
        boolean isEqual = true;
        for(int i = 0;i<tab.length;i++){
            if(expect[i]!=tab[i]){
                isEqual=false;
                break;
            }
        }
        assertTrue(isEqual);

    }
}
