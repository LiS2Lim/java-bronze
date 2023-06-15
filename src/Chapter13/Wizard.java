package Chapter13;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public Wizard(Wand wand) {
       setWand(wand);
    }

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復しました");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            new IllegalArgumentException("MPは0以上にしてください");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3) {
            new IllegalArgumentException("名前が短いです");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
