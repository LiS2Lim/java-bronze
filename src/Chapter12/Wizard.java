package Chapter12;

import Chapter10.Matango;

public class Wizard extends Character {
    int mp;

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃!");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }

    public void fireball(Matango m) {
        System.out.println(this.name + "は日の球を放った");
        System.out.println("敵に20ポイントのダメージ");
        m.hp -= 20;
        this.mp -= 5;
    }
}
