/*
問題1-1
練習問題1番は、穴埋め問題のため、ソースコードなし
 */
class Question1 {
    Question1() {
        System.out.println("Question1 : 省略");
    }
}
/*
問題1-2
ソースコード内で3を変数aに、5を変数bに入れ、その掛け算の結果を変数cに入れて、最後に変更cを表示してください。
 */
class Question2 {
    Question2() {
        int a = 3;
        int b = 5;
        int c = a + b;
        System.out.printf("Question2 : 縦幅%d、横幅%dの長方型の面積は%dです。%n", a, b, c);
    }
}

/*
問題1-3
以下に示した5つの値を格納するために適した型を考え、初期化による宣言を行うソースコードを作成してください。
(代入した値を画面に表示する必要はない)
なお、変数名は自由に考えてかまいませんが、Javaのルールに従ったものにしてください。
2つ以上の型がある場合はどちらでもかまいません、

①true　②'駆'　③3.14　④314159265853979L　⑤"ミナトの攻撃！敵に15ポイントのダメージを与えた"
 */
class Question3 {
    boolean r1 = true;
    char r2 = '駆';
    double r3 = 3.14;
    long r4 = 314159265853979L;
    String r5 = "ミナトの攻撃！敵に15ポイントのダメージを与えた";

    Question3(){
        System.out.printf("r1:%s, r2:%s, r3:%s, r4:%s, r5:%s",r1,r2,r3,r4,r5);
    }
}

public class Chapter1 {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        Question2 q2 = new Question2();
        Question3 q3 = new Question3();
    }
}
