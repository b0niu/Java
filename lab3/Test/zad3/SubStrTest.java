package zad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubStrTest {
    @Test
    public void ZawieraSie() {
        SubString s =new SubString("xyz","yzxyzxyzxyzx");
        int count=s.substring();
        assertEquals(count,5);
    }

    @Test
    public void NieZawieraSie()  {
        SubString s =new SubString("xyz","xxx");
        int count=s.substring();
        assertEquals(count,-1);
    }
}
