package Arenas;

import arsenal.IAffect;
import characters.Fighter;
import characters.Healer;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JungleArenaTest {

    JungleArena jungleArena;
    Fighter goodie;
    Fighter baddie;
    Healer healer;
    IAffect sword;

    @Before
    public void before() {
        goodie = new Fighter("Jenkins", "goodie", 100, 0);
        baddie = new Fighter("Bob", "baddie", 100, 20);
        healer = new Healer("Holly", 100, 5);
        sword = new IAffect("sword", 20);
        jungleArena = new JungleArena(goodie, baddie, healer);
    }

    @Test
    public void getGoodieName(){
        assertEquals("Jenkins", goodie.getName());
    }

    @Test
    public void getBaddieName(){
        assertEquals("Bob", baddie.getName());
    }

    @Test
    public void getHealerName(){
        assertEquals("Holly", healer.getName());
    }

    @Test
    public void canGetHealth(){
        TestCase.assertEquals(100, goodie.getHealth());
    }

    @Test
    public void canSetupBattlefieldAndGetGoodieNames() {
        assertEquals("Jenkins", jungleArena.jungleGetGoodieName());
    }


}
