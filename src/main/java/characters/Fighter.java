package characters;

import arsenal.IAffect;

import java.util.HashMap;

public class Fighter extends Character {

    private HashMap<String, IAffect> iAffects;

    public Fighter(String name, int health, int treasure){
        super(name, health, treasure);
        this.iAffects = new HashMap<String, IAffect>();
    }

    public int getNumberOfIAffects() {
        return iAffects.size();
    }

    public void addIAffect(IAffect iAffect){
        iAffects.put(iAffect.getImplement(), iAffect);
    }

    public void attack(Fighter fighterGettingHit, String iAttack){
        int health = fighterGettingHit.getHealth();
        int damage = this.iAffects.get(iAttack).getIAffectAmount();
        fighterGettingHit.setHealth(health - damage);

        if (fighterGettingHit.getHealth() < 0){
            this.setTreasure(fighterGettingHit.getTreasure());
        };
    }


}
