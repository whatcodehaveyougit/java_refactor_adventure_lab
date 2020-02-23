import Arenas.Arena;
import arsenal.IAffect;
import characters.Fighter;
import characters.Healer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArenaTest {

    Arena arena;
    Fighter goodie;
    Fighter baddie;
    Healer healer;
    IAffect sword;

    @Before
    public void before(){
        goodie = new Fighter("Gandalf", "goodie", 100, 0);
        sword = new IAffect("sword",20);
        goodie.addIAffect(sword);
        baddie = new Fighter("Bob", "goodie", 100, 0);
        arena = new Arena(goodie, baddie, healer);
    }

    @Test
    public void getFighter(){
        assertEquals(goodie, arena.getFighter());
    }

    @Test
    public void fighterCanGetWeapon(){
        assertEquals(1, goodie.getNumberOfIAffects());
    }

    @Test
    public void getHealer(){
        assertEquals(healer, arena.getHealer());
    }



}
