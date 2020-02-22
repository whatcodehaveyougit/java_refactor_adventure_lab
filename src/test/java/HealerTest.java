import characters.Healer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HealerTest {

    Healer healer;

    @Before
    public void before(){
        healer = new Healer("Holly", 100, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Holly", healer.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, healer.getHealth());
    }

    @Test
    public void startsWithNoRemedies(){
        assertEquals(0, healer.getNumberOfRemedies());
    }



}
