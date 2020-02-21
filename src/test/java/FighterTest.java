import arsenal.Weapon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    characters.Fighter fighter;
    Weapon sword;

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
        Assert.assertEquals(0, fighter.getNumberOfWeapons());
    }


    @Test
    public void canAddWeaponsToGoodie(){
        fighter.addWeapon(sword);
        fighter.addWeapon(sword);
        assertEquals(2, fighter.getNumberOfWeapons());
    }



}
