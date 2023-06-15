package Chapter10;

public class PoisonMatango extends Matango {
    int poisonCount = 5;
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    @Override
    public void attack(Hero h) {
        //①「通常のお化けキノコ同様の攻撃」を行う
        super.attack(h);

        //②「独香月の残り回数」が0でなければ、以下を追加で行う
        if (this.poisonCount > 0) {
            //③画面に「さらに毒の胞子をばらまいた！」と表示。
            System.out.println("さらに毒の胞子をばらまいた！");

            //④勇者のHPの1/5に相当するポイントを勇者のHPから引き、そのポイントを示すよう「～ポイントのダメージ！」と表示する
            int damege = h.hp / 5;
            h.hp -= damege;
            System.out.println(damege + "ポイントのダメージ！");

            //⑤「毒攻撃の残り回数」を1減らす
            this.poisonCount--;
        }
    }
}
