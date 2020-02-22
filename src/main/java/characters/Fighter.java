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

    public String findIAffectInEnemy(Fighter opponent, IAffect iAffect) {
        String armour;
        armour = "no armour";
        for (String key : opponent.iAffects.keySet()) {
            if (opponent.iAffects.get(key).getImplement().toString() == "armour") {
                armour = "armour";
            }
        }
        return armour;
    }


    public void attack(Fighter fighterGettingHit, IAffect weapon){
        int health = fighterGettingHit.getHealth();
        int damage = this.iAffects.get(weapon.getImplement()).getIAffectAmount();
        for (String key : fighterGettingHit.iAffects.keySet()) {
            if(fighterGettingHit.iAffects.get(key).getImplement() == "armour"){
                damage = damage / 2;
            }
        }
        fighterGettingHit.setHealth(health - damage);

        if (fighterGettingHit.getHealth() < 0){
            this.setTreasure(fighterGettingHit.getTreasure());
        };
    }



}
