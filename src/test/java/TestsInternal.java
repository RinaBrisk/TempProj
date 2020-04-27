import org.junit.Assert;
import org.junit.Test;

public class TestsInternal {

    @Test
    public void checkSum(){
        int result = HelloWorld.sum(0, 3);
        Assert.assertEquals(3, result);
    }
}
