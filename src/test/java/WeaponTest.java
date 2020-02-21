import arsenal.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("sword", 20);
    }

    @Test
    public void getSwordDamage() {
        assertEquals(20, weapon.getDamage());
    }

}
