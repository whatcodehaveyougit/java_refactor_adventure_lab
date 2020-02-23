package Arsenal;

import arsenal.IAffect;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IAffectTest {

    IAffect iAffect;

    @Before
    public void before(){
        iAffect = new IAffect("sword", 20);
    }

    @Test
    public void get_implement_name(){
        assertEquals("sword", iAffect.getImplement());
    }

    @Test
    public void get_implement_affect(){
        assertEquals(20, iAffect.getIAffectAmount());
    }

}
