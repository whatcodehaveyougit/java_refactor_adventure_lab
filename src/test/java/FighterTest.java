import arsenal.IAffect;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    characters.Fighter fighter;
    IAffect sword;

    @Before
    public void before(){
        fighter = new characters.Fighter("Jenkins", 100, 0);
    }

    @Test
    public void canGetName(){
        assertEquals("Jenkins", fighter.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, fighter.getHealth());
    }

    @Test
    public void canSetHealth(){
        fighter.setHealth(90);
        assertEquals(90, fighter.getHealth());
    }

    @Test
    public void canGetTreasure() {
        fighter.getTreasure();
        assertEquals(0, fighter.getTreasure());
    }

    @Test
    public void goodieStartsWithZeroWeapons(){
        Assert.assertEquals(0, fighter.getNumberOfIAffects());
    }


    @Test
    public void canAddWeaponsToGoodie(){
        fighter.addIAffect(sword);
        fighter.addIAffect(sword);
        assertEquals(2, fighter.getNumberOfIAffects());
    }



}
