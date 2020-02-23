package Arenas;

import characters.Fighter;
import characters.Healer;

public abstract class Arena {
    private Fighter goodie;
    private Fighter baddie;
    private Healer healer;

    public Arena(Fighter goodie, Fighter baddie, Healer healer){
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


}
