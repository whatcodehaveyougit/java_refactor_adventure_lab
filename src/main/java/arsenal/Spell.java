package arsenal;

public class Spell {

    private String name;
    private int damage;

    public Spell(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }


}
