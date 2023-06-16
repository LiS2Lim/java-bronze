package Chapter14;

public class Cleric {
    private static final int MAX_HP = 50;
    private static final int MAX_MP = 10;
    private String name;
    private int hp = 50;
    private int mp = 10;

    Cleric(String name) {
        this.name = name;
    }

    public void selfAid() {
        if (this.mp >= 5) {
            this.hp = this.MAX_HP;
            System.out.println("HPを最大値まで回復しました！");
        } else {
            System.out.println("MPが不足しています");
        }
    }

    public int pray(int prayTime) {
        int healingPoint = prayTime + new java.util.Random().nextInt(3);
        if (healingPoint + this.mp > this.MAX_MP) {
            healingPoint = this.MAX_MP - this.mp;
        }
        // int revocerActual = java.util.Math.min(MAX_MP - mp, healingPoint);
        this.mp += healingPoint;
        return healingPoint;
    }
}
