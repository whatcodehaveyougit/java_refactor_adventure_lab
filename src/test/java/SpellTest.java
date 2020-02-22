import arsenal.Spell;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpellTest {

    Spell fireball;

    @Before
    public void before() {
        fireball = new Spell("fireball", 20);
    }

    @Test
    public void getName() {
        assertEquals("fireball", fireball.getName());
    }

    @Test
    public void getDamage(){
        assertEquals(20, fireball.getDamage());
    }
}
