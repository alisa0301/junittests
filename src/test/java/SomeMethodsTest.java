import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomeMethodsTest {

    @Test
    public void assertionTrueTest() {
        assertTrue("Я люблю котов".contains("котов"));
    }

    @Test
    public void assertionFalseTest() {
        assertFalse("Я люблю котов".contains("мороженое"));
    }

    @Test
    public void assertionNotNullTest() {
        Assert.assertNotNull(1);
    }

    @Test
    public void hamcrestAssertTest() {
        String actualValue = "Я люблю котов, спать и мороженое";
        MatcherAssert.assertThat("Строка не соответствует шаблону",
                actualValue,
                CoreMatchers.endsWith("плавать"));
    }
}
