package quest;

import Arenas.Arena;
import Arenas.IArena;
import characters.Fighter;

import java.util.ArrayList;

public class Quest {

    private ArrayList<IArena> battleArenas;

    public Quest(ArrayList<IArena> battleArenas){
        this.battleArenas = battleArenas;
    }


    public int getNumberOfArenas() {
        return this.battleArenas.size();
    }

    public void addArena(IArena arena){
        this.battleArenas.add(arena);
    }

    public void fighterEntersRoom(Fighter goodie) {
        if (goodie.getTreasure() == 0) {

        }
    }
}
