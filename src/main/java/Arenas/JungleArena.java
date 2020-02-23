package Arenas;

import characters.Fighter;
import characters.Healer;

public class JungleArena extends Arena {

        public JungleArena(String arenaName, Fighter goodie, Fighter baddie, Healer healer) {
           super(arenaName, goodie, baddie, healer);
        }

        public void setupJungleArena(Fighter goodie, Fighter baddie, Healer healer) {
//             System.out.println( goodie.getName() + " and " + baddie.getName() + " are ready to fight.  " + healer.getName() + " is free to heal s" + goodie.getName());
            this.goodie = goodie;
            this.baddie = baddie;
            this.healer = healer;
        }

        public String jungleGetGoodieName() {
            return this.goodie.getName();
        }

        public String goodieEntersJungleArena(Fighter goodie) {
            return goodie.getName() + " is in the jungle!";
        }

}

