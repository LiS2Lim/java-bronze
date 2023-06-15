/*
問題9-1
次のようなThiefクラスがあります。
このクラスについて、次の要件を満たすコンストラクタを定義してください。

public class Thief {
    String name;
    int hp;
    int mp;
}

・このクラスは、「new Thief("アカサ",40,5)」のように、名前・HP・MPを指定してインスタンス化することができる。
・このクラスは、「new Thief("アカサ",35)」のように、名前とHPだけを指定してインスタンス化することもできる。この場合MPは5で初期化される。
・このクラスは、「new Thief("アカサ")」のように、名前だけを指定してインスタンス化することもできる。この場合、HPは40、MPは5で初期化される。
・このクラスは、「new Thief()」のように、名前を指定しない場合は、インスタンス化できないものとする。
・コンストラクタは極力重複コードをなくすように記述する
 */
class Question9_1 {
    Question9_1() {
        System.out.printf("%nQuestion 9-1%n");
        String aws = """
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
                """;
        System.out.println(aws);
    }
}

/*
問題9-2
練習9-1のThiefクラスを利用する次のようなプログラムがあります。
このプログラムの実行結果と、そのように表示される理由を「参照」という言葉を用いて説明してください。

public class Main {
    public static void heal(int hp) {
        hp += 10;
    }
    public static void heal(Thief thief) {
        thief.hp += 10;
    }
    public static void main(String[] args) {
        int baseHp = 25;
        Thief t = new Thief("アカサ", baseHp);
        heal(baseHp);
        System.out.println(baseHp + " : " + t.hp);
        heal(t);
        System.out.println(baseHp + " : " + t.hp);
    }
}
 */
class Question9_2 {
    Question9_2() {
        System.out.printf("%nQuestion 9-2%n");
        String aws = """
                public static void main(String[] args) {
                    int baseHp = 25;
                    Thief t = new Thief("アカサ", baseHp);
                    heal(baseHp);
                    System.out.println(baseHp + " : " + t.hp); //healで回復したhpはメソッド内で消滅するので、baseHpとt.hpは同じく25になる。
                    heal(t);
                    System.out.println(baseHp + " : " + t.hp); //healでインスタンスの参照を渡しているので、tの持っているhpが回復され、t.hpは35になる。
                }
                """;
        System.out.println(aws);
    }
}

public class Chapter9 {
    public static void main(String[] args) {
        Question9_1 q1 = new Question9_1();
        Question9_2 q2 = new Question9_2();
    }
}
