package characters;


public class Healer extends Character {

    public Healer(String name, int health, int treasure){
        super(name, health, treasure);
    }

    public void healFighter(Fighter fighter){
        fighter.setHealth(fighter.getHealth() + 20);
        if (fighter.getHealth() > 100 ){
            fighter.setHealth(100);
        }
    }
}
