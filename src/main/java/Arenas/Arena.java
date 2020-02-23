package Arenas;

import characters.Fighter;
import characters.Healer;

import java.util.ArrayList;

public abstract class Arena implements IArena {
    protected String  arenaName;
    protected Fighter goodie;
    protected Fighter baddie;
    protected Healer healer;

    public Arena(String arenaName, Fighter goodie, Fighter baddie, Healer healer){
        this.arenaName = arenaName;
        this.goodie = goodie;
        this.baddie = baddie;
        this.healer = healer;
    }

    public Fighter getFighter(){
        return this.goodie;
    }

    public Healer getHealer() {
        return this.healer;
    }

    public String getArenaName() {
        return arenaName;
    }

    public Fighter getGoodie() {
        return goodie;
    }

    public Fighter getBaddie() {
        return baddie;
    }
}
