package Arenas;

import characters.Fighter;
import characters.Healer;

import java.util.HashMap;

public class JungleArena extends Arena {

    // Here I had this as a characters HashMap but had to make it fighters
    // I did not want to use an interface to coerce them into being Characters and then not
    // be able to bring them back into their natural state??


    private HashMap<String, Fighter> fightersInRoom;
    private HashMap<String, Healer> healersInRoom;


    public JungleArena(String arenaName) {
        super(arenaName);
        this.fightersInRoom = new HashMap<String, Fighter>();
        this.healersInRoom = new HashMap<String, Healer>();
    }

    public HashMap<String, Fighter> getCharsInRoom() {
        return fightersInRoom;
    }

    public int countCharactersInRoom() {
        return this.fightersInRoom.size() + this.healersInRoom.size();
    }

    public void addFighterToRoom(Fighter fighter) {
        this.fightersInRoom.put(fighter.getName(), fighter);
    }

    public void addHealerToRoom(Healer healer){
        this.healersInRoom.put(healer.getName(), healer);
}

}

