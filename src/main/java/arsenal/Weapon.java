package arsenal;

public class Weapon {

    private String name;
    private int damage;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}
