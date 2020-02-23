package Arenas;

import characters.Fighter;
import characters.Healer;

public interface IArena {
    public Healer getHealer();
    public Fighter getFighter();
}
