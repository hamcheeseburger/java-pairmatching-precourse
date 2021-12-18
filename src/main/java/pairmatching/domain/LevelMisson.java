package pairmatching.domain;

import java.util.List;
import pairmatching.enums.Level;

public class LevelMisson {
    Level level;
    List<String> missons;

    public LevelMisson(Level level, List<String> missons) {
        this.level = level;
        this.missons = missons;
    }

    public Level getLevel() {
        return level;
    }

    public List<String> getMissons() {
        return missons;
    }

}
