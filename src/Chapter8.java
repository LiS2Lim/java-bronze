/*
問題8-1
現実世界の聖職者「クレリック」を表現するクラスClericをpublicで宣言してください。
その際、属性や操作は宣言する必要はありません。
また、作成したクラスを適切なファイル名で保存してください。
 */
class Question8_1 {
    Question8_1() {
        System.out.printf("%nQuestion8-1%n");
        String aws = """
                package Chapter7;

                public class Cleric {
                }
                """;
        System.out.println(aws);
    }
}

/*
問題8-2
聖職者は勇者のように名前やHPを持っており、さらに魔法を使うためのMPを持っています。
そこで、練習8-1で宣言した中身がないClericクラスに「名前」「HP」「最大HP」「MP」「最大MP」を属性として追加してください。
なお、HPと最大HPは整数で初期値50、MPと最大MPは整数で初期値10であり、最大HPと最大MPは定数フィールドとして宣言してください。
 */
class Question8_2 {
    Question8_2() {
        System.out.printf("%nQuestion8-2%n");
        String aws = """
                package Chapter7;

                public class Cleric {
                    private String name;
                    private int hp = 50;
                    private int maxHp = 50;
                    private int mp = 10;
                    private int maxMp = 10;

                    Cleric(String name) {
                        this.name = name;
                    }
                }
                """;
        System.out.println(aws);
    }
}

/*
問題8-3
聖職者は「セルフエイド」という魔法を使うことができ、MPを5消費することで自分自身のHPを最大HPまで回復することができます。
そこで、練習8-2で宣言したClericクラスに、「selfAid()」というメソッドを追加してください。
なお、このメソッドは引数なしで、戻り値もありません。
 */
class Question8_3 {
    Question8_3() {
        System.out.printf("%nQuestion8-3%n");
        String aws = """
                package Chapter7;

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
                            this.mp -= 5;
                            System.out.println("HPを最大値まで回復しました！");
                        } else {
                            System.out.println("MPが不足しています");
                        }
                    }
                }
                """;
        System.out.println(aws);
    }
}

/*
問題8-4
聖職者は「祈る」(pray)という行動を取ることができ、自分のMPを回復できます。
回復量は祈った秒数にランダムで0~2ポイントの補正を加えた量です。(例えば3秒祈ったら回復量は3～5ポイントのいずれか)
ただし、最大MPよりも回復することはありません。
そこで、練習8-3で宣言したClericクラスに「pray()」というメソッドを追加してください。
このメソッドは引数に「祈る秒数」を指定することで、戻り値として「実際に回復したMPの量」を返します。
 */
class Question8_4 {
    Question8_4() {
        System.out.printf("%nQuestion8-4%n");
        String aws = """
                package Chapter7;

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
                        this.mp += healingPoint;
                        return healingPoint;
                    }
                }
                """;
        System.out.println(aws);
    }
}

public class Chapter8 {
    public static void main(String[] args) {
        Question8_1 q1 = new Question8_1();
        Question8_2 q2 = new Question8_2();
        Question8_3 q3 = new Question8_3();
        Question8_4 q4 = new Question8_4();
    }
}
