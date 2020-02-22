package characters;

import arsenal.IAffect;

import java.util.ArrayList;

public class Fighter extends Character {

    private ArrayList<IAffect> weapons;

    public Fighter(String name, int health, int treasure){
        super(name, health, treasure);
        this.weapons = new ArrayList<IAffect>();
    }

    public int getNumberOfWeapons() {
        return weapons.size();
    }

    public void addWeapon(IAffect weapon){
        weapons.add(weapon);
    }

    public void attack(Fighter fighterGettingHit, int weapon){
        int health = fighterGettingHit.getHealth();
        int damage = this.weapons.get(weapon).getDamage();
        fighterGettingHit.setHealth(health - damage);

        if (fighterGettingHit.getHealth() < 0){
            this.setTreasure(fighterGettingHit.getTreasure());
        };
    }


}
