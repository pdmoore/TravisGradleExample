import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void exampleTest() {
        System.out.println("exampleTest output");
        Assert.assertEquals(1, 1);
        Assert.fail("force build failure");
    }
}
