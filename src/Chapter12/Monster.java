package Chapter12;

public class Monster {
    int hp;
    public void attack(Character c) {
        c.hp -= 1;
        System.out.println(c.name + "は攻撃を受けてhpが1減った！");
    }
}
