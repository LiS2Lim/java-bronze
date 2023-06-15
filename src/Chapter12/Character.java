package Chapter12;

import Chapter10.Matango;

public abstract class Character {
    String name;
    int hp;

    Character(String name) {
        this.name = name;
    }
    Character() {
        this("無名");
    }

    public void run() {
        System.out.println(this.name + "is Running!");
    }
    public abstract void attack(Matango m);
}
