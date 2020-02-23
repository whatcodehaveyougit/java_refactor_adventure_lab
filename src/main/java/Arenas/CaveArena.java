package Arenas;

import characters.Fighter;
import characters.Healer;

public class CaveArena extends Arena  {

    private Fighter baddie2;

    public CaveArena(String arenaName, Fighter goodie, Fighter baddie, Healer healer, Fighter baddie2) {
        super(arenaName, goodie, baddie, healer);
        this.baddie2 = baddie2;
    }

    public void setupCaveArena(Fighter goodie, Fighter baddie, Healer healer, Fighter baddie2) {
        this.goodie = goodie;
        this.healer = healer;
        this.baddie = baddie;
        this.baddie2 = baddie2;
    }

}
