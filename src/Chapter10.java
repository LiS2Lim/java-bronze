import Chapter10.*;

class Question10_1 extends Questions {
    Question10_1() {
        super("""
                次の中から「誤った継承」である者をすべて選んでください。
                ①スーパークラス：Person     サブクラス：Student
                ②スーパークラス：Car        サブクラス：Engine
                ③スーパークラス：Father     サブクラス：Child
                ④スーパークラス：Food       サブクラス：Susi
                ⑤スーパークラス：SuperMan   サブクラス：Man
                
                答え：②、③、⑤
                """);
    }
}

class Question10_2 extends Questions {
    Question10_2() {
        super("""
                次のクラスに対する「親クラス」と「子クラス」を1つずつ考案して自由にあげてください。
                例) Character <- Hero <- SuperHero
                (1)ア <- Phone <- イ
                (2)ウ <- Car <- エ
                (3)オ <- Dictionary <- カ
                
                答え)ア：通信機
                    イ：スマートフォン
                    ウ：移動手段
                    エ：電気車
                    オ：本
                    カ：日本語辞書
                """);
    }
}

class Question10_3 extends Questions {
    Question10_3() {
        super("""
                次のようなクラスMatangoがあります。
                
                public class Matango {
                    int hp = 50;
                    char suffix;
                    public Matango(char suffix) {
                        this.suffix = suffix;
                    }
                    public void attack(Hero h) {
                        System.out.println("キノコ" + this.suffix + "の攻撃");
                        System.out.println("10のダメージ");
                        h.hp -= 10;
                    }
                }
                
                このクラスを利用し、次の仕様に沿ったPoisonMatangoクラスを作成してください。
                
                ア。お化け毒キノコ(PoisonMatango)は、お化けキノコ(Matango)の中でも特に「毒攻撃」ができる
                イ。PoisonMatangoは以下のコードでインスタンス化できるクラスとする。
                    PoisonMatango pm = new PoisonMatango('A');
                ウ。PoisonMatangoは、毒を用いた攻撃が可能な残り回数をint型フィールドとして持っており、初期値は5である。
                エ。PoisonMatangoは、attackメソッドが呼ばれると次の内容の攻撃をする。
                    ①「通常のお化けキノコ同様の攻撃」を行う
                    ②「独香月の残り回数」が0でなければ、以下を追加で行う
                    ③画面に「さらに毒の胞子をばらまいた！」と表示。
                    ④勇者のHPの1/5に相当するポイントを勇者のHPから引き、そのポイントを示すよう「～ポイントのダメージ！」と表示する
                    ⑤「毒攻撃の残り回数」を1減らす
                
                """);
    }
}

public class Chapter10 {
    public static void main(String[] args) {
        Question10_1 q1 = new Question10_1();
        Question10_2 q2 = new Question10_2();
        Question10_3 q3 = new Question10_3();
        PoisonMatango pm = new PoisonMatango('A');
        Hero hero = new Hero("勇者");
        pm.attack(hero);
    }
}
