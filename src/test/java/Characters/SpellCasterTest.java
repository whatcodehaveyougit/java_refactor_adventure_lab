package Characters;

import arsenal.Spell;
import characters.SpellCaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpellCasterTest {

    SpellCaster wizard;
    Spell spell1;

    @Before
    public void before(){
        wizard = new SpellCaster("Oz", 100, 20);
        spell1 = new Spell("fireball", 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Oz", wizard.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canSetHealth(){
        wizard.setHealth(90);
        assertEquals(90, wizard.getHealth());
    }

    @Test
    public void canGetTreasure() {
        wizard.getTreasure();
        assertEquals(20, wizard.getTreasure());
    }

    @Test
    public void startsWithNoSpells(){
        assertEquals(0, wizard.getNumberOfSpells());
    }

    @Test
    public void canAddSpells(){
        wizard.addSpell(spell1);
        assertEquals(1, wizard.getNumberOfSpells());
    }

}
