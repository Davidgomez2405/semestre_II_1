package constructor;

public class Arena {
    private int level;
    private int trophies;

    public Arena() {
    }

    public Arena(int level, int trophies) {
        this.level = level;
        this.trophies = trophies;
    }

    public Arena(int level) {
        this.level = level;
    }

    public Arena(int level, int trophies, int x) {
        this.level = level;
        this.trophies = trophies;
    }
}
