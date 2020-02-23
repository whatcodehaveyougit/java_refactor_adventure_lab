package Arenas;

import characters.Fighter;
import characters.Healer;

import java.util.HashMap;

public class CaveArena extends Arena  {

    private Fighter baddie2;
    private HashMap<String, Character> charsInRoom;


    public CaveArena(String arenaName, Fighter baddie2) {
        super(arenaName);
        this.charsInRoom = new HashMap<String, Character>();
        this.baddie2 = baddie2;
    }

}
