package characters;


import arsenal.IAffect;

import java.util.ArrayList;

public class Healer extends Character {

    private ArrayList<IAffect> remedies;

    public Healer(String name, int health, int treasure){
        super(name, health, treasure);
        this.remedies = new ArrayList<IAffect>();
    }

    public void healFighter(Fighter fighter){
        fighter.setHealth(fighter.getHealth() + 20);
        if (fighter.getHealth() > 100 ){
            fighter.setHealth(100);
        }
    }

    public int getNumberOfRemedies() {
        return this.remedies.size();
    }
}
