package characters;

import arsenal.Spell;

import java.util.ArrayList;

public class SpellCaster extends Character {

    private ArrayList<Spell> spells;

    public SpellCaster(String name, int health, int treasure){
        super(name, health, treasure);
        this.spells = new ArrayList<Spell>();
    }

    public int getNumberOfSpells() {
        return spells.size();
    }

    public void addSpell(Spell spell){
        spells.add(spell);
    }

}

