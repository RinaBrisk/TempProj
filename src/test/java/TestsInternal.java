import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestsInternal {

    @Test
    public void checkSum() throws IOException {
        int result = HelloWorld.sum(0, 3);
        Assert.assertEquals(3, result);
    }
}
