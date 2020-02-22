package characters;

public abstract class Character {

    private String name;
    private int health;
    private int treasure;

    public Character(String name, int health, int treasure){
        this.name = name;
        this.health = health;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTreasure(){
        return this.treasure;
    }

    protected void setTreasure(int treasure) {
        this.treasure = treasure;
    }


}
