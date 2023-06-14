/*
問題7-1
ATM、券売機、ブログなどのほかに、「現実世界の人間の活動をプログラムで機械化・自動化しているもの」の例を考えて書き出してみましょう。
 */
class Question7_1 {
    Question7_1() {
        System.out.printf("%nQuestion 7-1%n");
        String aws = """
                メールを送る -> 紙に手書きで書いて、郵便配達員が届けていた手紙を機械化・自動化
                """;
        System.out.println(aws);
    }
}

/*
問題7-2
次のプログラムを作る場合に、登場するオブジェクト(現実世界の登場人物)にはどのようなものがあるか、自由に考えて書き出してみましょう。
①現在航行中のすべての飛行機と空港を管理する、航空管制システム
②国内の映画館を選択すると、その映画館での上演映画と、その主演俳優の一覧を表示してくれるプログラム
③余っている食材を入力すると、膨大なレシピの中からその食材を使う料理を検索してくれるプログラム
 */
class Question7_2 {
    Question7_2() {
        System.out.printf("%nQuestion 7-2%n");
        String aws = """
                ①現在航行中のすべての飛行機と空港を管理する、航空管制システム
                ->飛行機、管制塔
                ②国内の映画館を選択すると、その映画館での上演映画と、その主演俳優の一覧を表示してくれるプログラム
                ->映画館、映画、俳優
                ③余っている食材を入力すると、膨大なレシピの中からその食材を使う料理を検索してくれるプログラム
                ->食材、レシピ
                """;
        System.out.println(aws);
    }
}

/*
問題7-3
ある都市の観光案内所には、タッチパンネル式の「観光案内端末」が設置されています。
利用者が画面から希望条件を入力すると、おすすめのお店や名所旧跡の名前・所在地・電話番号・解説を提示してくれます。
この観光案内端末の中で動くプログラムの内部では、さまざまなオブジェクトが動作しています。
そこで以下2つのオブジェクトが持つであろう行動責任と情報保持責任を自由に考え、操作と属性として書き出してみましょう。
①現実世界の案内係を再現した「案内係」オブジェクト
②現実世界のお店や名所旧跡を再現した「観光地」オブジェクト
 */
class Question7_3 {
    Question7_3() {
        System.out.printf("%nQuestion 7-3%n");
        String aws = """
                ①現実世界の案内係を再現した「案内係」オブジェクト
                ->観光地検索
                ②現実世界のお店や名所旧跡を再現した「観光地」オブジェクト
                ->名前、住所、電話番号、解説
                """;
        System.out.println(aws);
    }
}

public class Chapter7 {
    public static void main(String[] args) {
        Question7_1 q1 = new Question7_1();
        Question7_2 q2 = new Question7_2();
        Question7_3 q3 = new Question7_3();
    }
}