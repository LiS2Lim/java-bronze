package Chapter9;

public class Thief {
    String name;
    int hp;
    int mp;

    Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    Thief(String name, int hp) {
        this(name, hp, 5);
    }
    Thief(String name) {
        this(name, 40, 5);
    }
}
