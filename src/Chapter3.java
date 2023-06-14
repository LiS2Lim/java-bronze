/*
問題3-1
次の日本語で機材された条件式を、Javaで記述してみましょう。
①変数 weightの値が60に等しい
②変数age1とage2の合計を2倍したものが60を超えている
③変数ageが奇数である
④変数nameの中身の文字列が「湊」と等しい
 */
class Question3_1 {
    Question3_1() {
        System.out.printf("%nQuestion3-1%n");

        //①変数 weightの値が60に等し
        System.out.println("weight == 60");

        //②変数age1とage2の合計を2倍したものが60を超えている
        System.out.println("(age1 + age2) * 2 > 60");

        //③変数ageが奇数である
        System.out.println("age%2 == 1");

        //④変数nameの中身の文字列が「湊」と等しい
        System.out.println("name.equals(\"湊\")");
    }
}

/*
問題3-2
次にあげるAからFの式のうち、条件式として適切なものを選んでください
A.cost = 300*1.05
B.3
C.age != 30
D.true
E.b+5 < 20
F.isNumeric = true
 */
class Question3_2 {
    Question3_2() {
        System.out.printf("%nQuestion3-2%n");
        System.out.println("(x)cost = 300*1.05");
        System.out.println("(x)3");
        System.out.println("(o)age != 30");
        System.out.println("(o)true");
        System.out.println("(o)b+5 < 20");
        System.out.println("(x)isNumeric = true");
    }
}

/*
問題3-3
次の内容に沿ったJavaプログラムを作成してください。
①int型の変数isHungryを定義し、0か1を代入する(どちらを代入してもかまわない)
　また、String型の変数foodを定義し、適当な食べ物の名前を代入する。
②画面に「こんにちは」と表示する
③もし変数isHungryが0であれば「おなかがいっぱいです」、そうでなければ「はらぺこです」と表示する
④もし変数isHungryが空腹を示すならば、変数foodを利用して「〇〇をいただきます」と表示する（〇〇には食べ物の名前が入る）
⑤最後に「ごちそうさまでした」と表示する
 */
class Question3_3 {
    Question3_3() {
        System.out.printf("%nQuestion3-3%n");

        //①int型の変数isHungryを定義し、0か1を代入する(どちらを代入してもかまわない)
        //　また、String型の変数foodを定義し、適当な食べ物の名前を代入する。
        int isHungry = 1;
        String food = "Banana";

        //②画面に「こんにちは」と表示する
        System.out.println("こんにちは");

        //③もし変数isHungryが0であれば「おなかがいっぱいです」、そうでなければ「はらぺこです」と表示する
        //④もし変数isHungryが空腹を示すならば、変数foodを利用して「〇〇をいただきます」と表示する（〇〇には食べ物の名前が入る）
        //⑤最後に「ごちそうさまでした」と表示する
        if (isHungry == 0) {
            System.out.println("おなかがいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.printf("%sをいただきます%n",food);
            System.out.println("ごちそうさまでした");
        }

    }
}

/*
問題3-4
次のようなJavaコードがあります

public class Main {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else
            System.out.println("DVDを見ます");
    }
}

3目のtenkiがfalseの場合、「DVDを見ます」の後に「寝ます」を表示するように変更するため、8行目の次に「寝ます」と表示する行を以下のように追加しました
            System.out.println("散歩にいきます");
        } else
            System.out.println("DVDを見ます");
            System.out.println("寝ます");
    }
}

しかし、このプログラムは意図したように動きません。
どの部分に誤りがあり、どのような現象が発生しているかを答えてください。
そして、誤りを修正するには、どうすればよいかを教えてください。

 */
class Question3_4 {
    Question3_4() {
        System.out.printf("%nQuestion3-4%n");
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else {
            System.out.println("DVDを見ます");
            System.out.println("寝ます");
        } //括弧を追加
    }
}

/*
問題3-5
switch分を用いて次の条件を満たすプログラムを作成してください。
①画面に「「メニュー」1:検索 2:登録 3:削除 4:変更>」と表示する。
　表示後は改行しないこと
②数字を入力し、変数selectedに代入する
③もし変数selectedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」と表示する
④selectedが1から4のいずれでもない場合は何もしない
 */
class Question3_5 {
    Question3_5() {
        System.out.printf("%nQuestion3-5%n");

        //①画面に「「メニュー」1:検索 2:登録 3:削除 4:変更>」と表示する。
        //　表示後は改行しないこと
        System.out.print("「メニュー」1:検索 2:登録 3:削除 4:変更>");

        //②数字を入力し、変数selectedに代入する
        int selected = 0;
        try {
            selected = new java.util.Scanner(System.in).nextInt();
        } catch(Exception e) {
            System.err.println(e.toString());
        }

        //③もし変数selectedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」と表示する
        //④selectedが1から4のいずれでもない場合は何もしない
        switch (selected) {
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
            default:
                break;
        }
    }
}

/*
問題3-6
付きの条件に従ってプログラムを記述してください
①画面に「【数あてゲーム】」と表示する
②0から9までの整数の中からランダムな数を1つ生成して、変数ansに代入する
③for文を用いた「5回繰り返すループ」を作る。その際に以下の④～⑦は、ループの中に記述する
④画面に「0～9の数字を入力してください」と表示する
⑤数字を入力し、変数numに代入する
⑥もし変数numが変数ansと等しかったら「アタリ！」と画面に表示して繰り返しを終了する
⑦もし変数numが変数ansと等しくない場合は「違います」と表示する
⑧繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する
 */
class Question3_6 {
    Question3_6() {
        System.out.printf("%nQuestion3-6%n");

        //①画面に「【数あてゲーム】」と表示する
        System.out.println("【数あてゲーム】");

        //②0から9までの整数の中からランダムな数を1つ生成して、変数ansに代入する
        int ans = new java.util.Random().nextInt(10);

        //③for文を用いた「5回繰り返すループ」を作る。その際に以下の④～⑦は、ループの中に記述する
        for (int i = 0; i < 5; i++) {
            //④画面に「0～9の数字を入力してください」と表示する
            System.out.println("0～9の数字を入力してください");

            //⑤数字を入力し、変数numに代入する
            int num = new java.util.Scanner(System.in).nextInt();

            //⑥もし変数numが変数ansと等しかったら「アタリ！」と画面に表示して繰り返しを終了する
            //⑦もし変数numが変数ansと等しくない場合は「違います」と表示する
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        //⑧繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する
        System.out.printf("答えは「%d」でした。ゲームを終了します%n",ans);
    }
}

public class Chapter3 {
    public static void main(String[] args) {
        Question3_1 q1 = new Question3_1();
        Question3_2 q2 = new Question3_2();
        Question3_3 q3 = new Question3_3();
        Question3_4 q4 = new Question3_4();
        Question3_5 q5 = new Question3_5();
        Question3_6 q6 = new Question3_6();
    }
}
