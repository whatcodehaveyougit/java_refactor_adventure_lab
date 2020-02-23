import Arenas.Arena;
import Arenas.CaveArena;
import Arenas.IArena;
import Arenas.JungleArena;
import arsenal.IAffect;
import characters.Fighter;
import characters.Healer;
import org.junit.Before;
import org.junit.Test;
import quest.Quest;

import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class QuestTest {

    String arenaName;
    Quest quest;
    IArena jungleArena;
    IArena caveArena;
    Fighter goodie;
    Fighter baddie;
    Fighter baddie2;
    Healer healer;
    IAffect sword;

    @Before
    public void before(){

        goodie = new Fighter("Jenkins", "goodie", 100, 0);
        baddie = new Fighter("Bob", "baddie", 100, 20);
        baddie2 = new Fighter("Bill", "baddie", 100, 20);
        healer = new Healer("Holly", 100, 5);
        sword = new IAffect("sword", 20);
        jungleArena = new JungleArena(arenaName, goodie, baddie, healer);
        caveArena = new CaveArena(arenaName,goodie, baddie, healer, baddie2);
        ArrayList<IArena> arenas = new ArrayList<IArena>();
        quest = new Quest(arenas);
    }

    @Test
    public void questBeginsEmpty() {
        assertEquals(0, quest.getNumberOfArenas());
    }

    @Test
    public void questsCanBeAdded() {
        quest.addArena(jungleArena);
        quest.addArena(caveArena);
        assertEquals(2, quest.getNumberOfArenas());
    }

    @Test
    public void fighterEntersARoom() {
        quest.addArena(jungleArena);
        quest.addArena(caveArena);
        quest.fighterEntersRoom(goodie);
        assertEquals("Jenkins is in the jungle!", );
    }
}
