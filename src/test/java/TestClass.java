import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void isOk(){
        int i = 3;
        int m = 5;
        int result = 8;
        assertEquals(HelloWorld.sum(i, m), result);
    }
}
