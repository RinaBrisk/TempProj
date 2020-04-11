
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void isOk(){
        int i = 3;
        int m = 5;
        int result = 8;
        assertEquals(HelloWorld.sum(i, m), result);
    }

    @Test
    public void isNotOk(){
        int i = 3;
        int m = 5;
        int errorResult = 10;
        assertNotEquals(HelloWorld.sum(i, m),errorResult);
    }
}
