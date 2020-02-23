import Arenas.Arena;
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

    Quest quest;
    IArena jungleArena;
    Fighter goodie;
    Fighter baddie;
    Healer healer;
    IAffect sword;

    @Before
    public void before(){

        goodie = new Fighter("Jenkins", "goodie", 100, 0);
        baddie = new Fighter("Bob", "baddie", 100, 20);
        healer = new Healer("Holly", 100, 5);
        sword = new IAffect("sword", 20);
        jungleArena = new JungleArena(goodie, baddie, healer);
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
        assertEquals(1, quest.getNumberOfArenas());
    }
}
