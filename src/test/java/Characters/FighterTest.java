package Characters;

import arsenal.IAffect;
import characters.Fighter;
import characters.Healer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    Fighter goodie;
    Fighter goodie1;
    Fighter baddie;
    Healer healer;
    IAffect sword;
    IAffect bigSword;
    IAffect armour;

    @Before
    public void before(){
        goodie = new Fighter("Jenkins", "goodie", 100, 0);
        goodie1 = new Fighter("Gandalf1", "goodie", 100, 0);
        baddie = new Fighter("Bob", "baddie",  100, 20);
        healer = new Healer("Holly", 100, 5);
        sword = new IAffect("sword", 20);
        bigSword = new IAffect("bigSword", 110);
        armour = new IAffect("armour", 0);
        goodie.addIAffect(sword);
    }

    @Test
    public void canGetName(){
        assertEquals("Jenkins", goodie.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, goodie.getHealth());
    }

    @Test
    public void canSetHealth(){
        goodie.setHealth(90);
        assertEquals(90, goodie.getHealth());
    }

    @Test
    public void canGetTreasure() {
        goodie.getTreasure();
        assertEquals(0, goodie.getTreasure());
    }

    @Test
    public void canGetGoodieOrBaddie() {
        assertEquals("goodie", goodie.getGoodieOrBaddie());
    }

    @Test
    public void goodieStartsWithZeroWeapons(){
        Assert.assertEquals(1, goodie.getNumberOfIAffects());
    }


    @Test
    public void canAddWeaponsToGoodie(){
        goodie.addIAffect(sword);
        assertEquals(1, goodie.getNumberOfIAffects());
    }

// THis did not work when I had the function returning a Boolean = wierd!
    @Test
    public void canConfirmIfEnemyHasASpecificWeapon(){
        goodie.addIAffect(armour);
        assertEquals("They have armour", baddie.findIAffectInEnemy(goodie, armour));
    }

    @Test
    public void fighterLosesLessHealthWithArmour() {
        goodie.addIAffect(armour);
        baddie.addIAffect(sword);
        baddie.attack(goodie, sword);
        assertEquals(90, goodie.getHealth());
    }

    @Test
    public void goodieCanAttackBaddie(){
        goodie.attack(baddie, sword, goodie)s;
        assertEquals(80, baddie.getHealth());
    }

    @Test
    public void fighterCanBeHealed(){
        goodie.attack(baddie, sword);
        goodie.attack(baddie, sword);
        healer.healFighter(baddie);
        assertEquals(80, baddie.getHealth());
    }

    @Test
    public void fighterCannotBeHealedAbove100(){
        healer.healFighter(baddie);
        assertEquals(100, baddie.getHealth());
    }

    @Test
    public void fighterGivesTreasureAwayWhenTheyDie(){
        goodie1.addIAffect(bigSword);
        goodie1.attack(baddie, bigSword);
        assertEquals(20, goodie1.getTreasure());
    }




}
