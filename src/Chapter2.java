import java.util.Random;
import java.util.Scanner;

/*
問題2-1
次のようなプログラムがあります

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String ans = "X+yは" + x + y;
        System.out.println(ans);
    }
}

このプログラムを実行すると以下の結果が表示されます。
x+yは510
[x+yは15]と表示させたいのですが、意図通りに動きません。
正しく動作するように修正してください。
 */
class Question21 {
    Question21() {
        int x = 5;
        int y = 10;
        String ans = "X+yは" + (x + y); //回答：文字列と数字が合体すると文字列として変更されるので、数字を先に合算する
        System.out.println(ans);
    }
}

/*
問題2-2
次の中で文法として正しいものをすべて選んでください。
①int x = 3 + 5.0;
②double d = 2.0F;
③int number = "5";
④String s = 2 + "人目";
⑤byte b = 1;
⑥double d = true;
⑦short s = (byte)2;
 */
class Question22 {
    Question22() {
        double x = 3 + 5.0; // 小数点の表記のため、doubleに変更
        double d = 2.0F; // ok
        String number = "5"; // ダブルクォーテーションで囲まれていたので文字列に変更
        String s = 2 + "人目"; // OK
        byte b = 1; // OK
        boolean d2 = true; //booleanがたに変更
        short s2 = (byte)2; // ok
        System.out.printf("1:%s 2:%s 3:%s 4:%s 5:%s 6:%s 7:%s %n",x,d,number,s,b,d2,s2);
    }
}

/*
以下の内容のプログラムを作成してください。

①画面に「ようこそ占いの館へ」と表示します
②画面に「あなたの名前を入力してください」と表示します
③キーボードから1行の文字入力を受け、String型の変更nameに格納します
④画面に「あなたの年齢を入力してください」と表示します
⑤キーボードから1行の文字入力を受け、String型の変更ageStringに格納します
⑥変数ageStringの内容をint型に変更し、int型の変数ageに代入します
⑦0から3までの乱数を生成し、int型の変数fortuneに代入します
⑧fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にします
⑨画面に「占いの結果が出ました！」と表示します
⑩画面に「(年齢)際の(名前)さん、あなたの運気番号は(乱数)です」と表示します
　その際に(年齢)には変数ageを、(名前)には変更nameを、そして(乱数)には8で作った数を表示します
⑪画面に「1:大吉 2:中吉 3:吉 4:凶」と表示します
 */
class Question23 {
    Question23() {
        //①画面に「ようこそ占いの館へ」と表示します
        System.out.println("ようこそ占いの館へ");

        //②画面に「あなたの名前を入力してください」と表示します
        System.out.print("あなたの名前を入力してください:");

        //③キーボードから1行の文字入力を受け、String型の変更nameに格納します
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //④画面に「あなたの年齢を入力してください」と表示します
        System.out.print("あなたの年齢を入力してください:");

        //⑤キーボードから1行の文字入力を受け、String型の変更ageStringに格納します
        String ageString = sc.nextLine();

        //⑥変数ageStringの内容をint型に変更し、int型の変数ageに代入します
        int age = Integer.parseInt(ageString);

        //⑦0から3までの乱数を生成し、int型の変数fortuneに代入します
        Random rm = new Random();
        int fortune = rm.nextInt(4);

        //⑧fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にします
        fortune++;

        //⑨画面に「占いの結果が出ました！」と表示します
        System.out.println("占いの結果が出ました！");

        //⑩画面に「(年齢)際の(名前)さん、あなたの運気番号は(乱数)です」と表示します
        //　その際に(年齢)には変数ageを、(名前)には変更nameを、そして(乱数)には8で作った数を表示します
        System.out.printf("%d際の%sさん、あなたの運気番号は%dです%n",age,name,fortune);

        //⑪画面に「1:大吉 2:中吉 3:吉 4:凶」と表示します
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");
    }
}

public class Chapter2 {
    public static void main(String[] args) {
        Question21 q21 = new Question21();
        Question22 q22 = new Question22();
        Question23 q23 = new Question23();
    }
}
