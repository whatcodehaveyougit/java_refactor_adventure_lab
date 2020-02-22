import arsenal.IAffect;
import characters.Fighter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    characters.Fighter goodie;
    Fighter baddie;
    IAffect sword;
    IAffect armour;

    @Before
    public void before(){
        goodie = new characters.Fighter("Jenkins", 100, 0);
        baddie = new Fighter("Bob", 100, 0);
        sword = new IAffect("sword", 20);
        armour = new IAffect("armour", 0);
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
    public void goodieStartsWithZeroWeapons(){
        Assert.assertEquals(0, goodie.getNumberOfIAffects());
    }


    @Test
    public void canAddWeaponsToGoodie(){
        goodie.addIAffect(sword);
        assertEquals(1, goodie.getNumberOfIAffects());
    }

    @Test
    public void canConfirmIfEnemyHasASpecificWeapon(){
        goodie.addIAffect(armour);
        assertEquals("armour", baddie.findIAffectInEnemy(goodie, armour));
    }

    @Test
    public void fighterLosesLessHealthWithArmour() {
        goodie.addIAffect(armour);
        baddie.addIAffect(sword);
        baddie.attack(goodie, sword);
        assertEquals(90, goodie.getHealth());
    }



}
