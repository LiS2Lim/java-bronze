package Chapter8;

public class Cleric {
    private String name;
    private int hp = 50;
    private int maxHp = 50;
    private int mp = 10;
    private int maxMp = 10;

    Cleric(String name) {
        this.name = name;
    }

    public void selfAid() {
        if (this.mp >= 5) {
            this.hp = this.maxHp;
            System.out.println("HPを最大値まで回復しました！");
        } else {
            System.out.println("MPが不足しています");
        }
    }

    public int pray(int prayTime) {
        int healingPoint = prayTime + new java.util.Random().nextInt(3);
        if (healingPoint + this.mp > this.maxMp) {
            healingPoint = this.maxMp - this.mp;
        }
        // int revocerActual = java.util.Math.min(maxMp - mp, healingPoint);
        this.mp += healingPoint;
        return healingPoint;
    }
}
