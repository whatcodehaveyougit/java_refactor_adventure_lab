package characters;

import Arenas.Arena;
import Arenas.JungleArena;
import arsenal.IAffect;

import java.util.HashMap;

public class Fighter extends Character {

    private HashMap<String, IAffect> iAffects;
    private String goodieOrBaddie;

    public Fighter(String name, String goodieOrBaddie, int health, int treasure){
        super(name, health, treasure);
        this.goodieOrBaddie = goodieOrBaddie;
        this.iAffects = new HashMap<String, IAffect>();
    }

    public String getGoodieOrBaddie() {
        return goodieOrBaddie;
    }

    public int getNumberOfIAffects() {
        return iAffects.size();
    }

    public void addIAffect(IAffect iAffect){
        this.iAffects.put(iAffect.getImplement(), iAffect);
    }

    public String findIAffectInEnemy(Fighter opponent, IAffect iAffect) {
        for (String key : opponent.iAffects.keySet()) {
            if (opponent.iAffects.get(key).getImplement().toString() == iAffect.getImplement().toString()) {
                return "They have " + iAffect.getImplement();
            }
        }
        return "The don't have " + iAffect.getImplement();
    }




    public void attack(Fighter fighterGettingHit, IAffect weapon, Fighter goodie){
        int health = fighterGettingHit.getHealth();
        int damage = this.iAffects.get(weapon.getImplement()).getIAffectAmount();
        for (String key : fighterGettingHit.iAffects.keySet()) {
            if(fighterGettingHit.iAffects.get(key).getImplement() == "armour"){
                damage = damage / 2;
            }
        }
        fighterGettingHit.setHealth(health - damage);

        if (fighterGettingHit.getHealth() < 0){
            int treasure = fighterGettingHit.getTreasure();
            fighterGettingHit.setTreasure(0);
            int playerTreasure = this.getTreasure();
            this.setTreasure(playerTreasure + treasure);
        }

    }



}
