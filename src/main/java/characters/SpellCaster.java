package characters;

import arsenal.Spell;

import java.util.ArrayList;

public class SpellCaster extends Character {

    private ArrayList<Spell> spells;
    private String goodieOrBaddie;

    public SpellCaster(String name, int health, int treasure){
        super(name, health, treasure);
        this.spells = new ArrayList<Spell>();
    }

    public String getGoodieOrBaddie() {
        return goodieOrBaddie;
    }

    public int getNumberOfSpells() {
        return spells.size();
    }

    public void addSpell(Spell spell){
        spells.add(spell);
    }

}

