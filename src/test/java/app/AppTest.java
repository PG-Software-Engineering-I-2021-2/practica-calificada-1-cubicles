package app;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void Test01() {
        App.main(new String[0]);
        Assert.assertTrue(true);
    }
}