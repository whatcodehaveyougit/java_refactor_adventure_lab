package Arenas;

import characters.Fighter;
import characters.Healer;

public class JungleArena extends Arena {

        public JungleArena(Fighter goodie, Fighter baddie, Healer healer) {
           super(goodie, baddie, healer);
        }

        public String setupJungleArena(Fighter goodie, Fighter baddie, Healer healer) {
             System.out.println( goodie.getName() + " and " + baddie.getName() + " are ready to fight.  "
            + healer.getName() + " is free to heal s" + goodie.getName());
             return "test";
        }

}

