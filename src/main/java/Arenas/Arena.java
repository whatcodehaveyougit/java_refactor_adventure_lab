package Arenas;

public abstract class Arena implements IArena {

    protected String  arenaName;

    public Arena(String arenaName){
        this.arenaName = arenaName;
    }


    public String getArenaName() {
        return arenaName;
    }

}
