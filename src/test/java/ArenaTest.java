import arsenal.Weapon;
import characters.Fighter;
import characters.Healer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArenaTest {

    Arena arena;
    Fighter goodie;
    Fighter goodie1;
    Weapon bigSword;
    Fighter baddie;
    Healer healer;
    Weapon sword;

    @Before
    public void before(){
        goodie = new Fighter("Gandalf", 100, 0);
        goodie1 = new Fighter("Gandalf1", 100, 0);
        sword = new Weapon("sword",20);
        bigSword = new Weapon("bigSword", 110);
        goodie.addWeapon(sword);
        baddie = new Fighter("Bob", 100, 20);
        healer = new Healer("Holly", 100, 5);
        arena = new Arena(goodie, baddie, healer);
    }

    @Test
    public void getFighter(){
        assertEquals(goodie, arena.getFighter());
    }

    @Test
    public void fighterCanGetWeapon(){
        assertEquals(1, goodie.getNumberOfWeapons());
    }

    @Test
    public void getHealer(){
        assertEquals(healer, arena.getHealer());
    }

    @Test
    public void goodieCanAttackBaddie(){
        goodie.attack(baddie);
        assertEquals(80, baddie.getHealth());
    }

    @Test
    public void fighterCanBeHealed(){
        goodie.attack(baddie);
        goodie.attack(baddie);
        healer.healFighter(baddie);
        assertEquals(80, baddie.getHealth());
    }

    @Test
    public void fighterCannotBeHealedAbove100(){
        healer.healFighter(baddie);
        assertEquals(100, baddie.getHealth());
    }

    @Test
    public void givesTreasureAwayWhenDie(){
        goodie1.addWeapon(bigSword);
        goodie1.attack(baddie);
        assertEquals(20, goodie.getTreasure());
    }
}
