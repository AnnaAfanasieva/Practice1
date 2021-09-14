package my.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part4Test {
    @Test
    public void testPart4() {
        Part4.main(new String[]{"25", "15"});
        Assert.assertEquals(5, Part4.result);
    }
}
