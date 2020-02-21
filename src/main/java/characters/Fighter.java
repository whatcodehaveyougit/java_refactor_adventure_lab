package characters;

import arsenal.Weapon;

import java.util.ArrayList;

public class Fighter extends Character {

    private ArrayList<Weapon> weapons;

    public Fighter(String name, int health, int treasure){
        super(name, health, treasure);
        this.weapons = new ArrayList<Weapon>();
    }

    public int getNumberOfWeapons() {
        return weapons.size();
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public void attack(Fighter fighterGettingHit){
        int health = fighterGettingHit.getHealth();
        int damage = this.weapons.get(0).getDamage();
        fighterGettingHit.setHealth(health - damage);

        if (fighterGettingHit.getHealth() < 0){

        };
    }

    public int dead){
        if (this.getHealth() < 0){
        return fighter.getTreasure();
    }


}
