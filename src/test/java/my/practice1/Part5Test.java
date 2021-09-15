package my.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part5Test {
    @Test
    public void testPart5() {
        Part5.main(new String[]{"256504552"});
        Assert.assertEquals(34, Part5.result);
    }
}
