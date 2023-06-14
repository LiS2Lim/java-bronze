/*
問題5-1
以下の使用を参考にメソッド[introduceOneself]を定義してください。
さらに定義したメソッドをmainメソッドから呼び出してください。

メソッド名：introduceOneself
戻り値の型：なし
引数リスト：なし
処理内容：名前(文字列)、年齢(整数)、身長(浮動小数点)、十二支(1文字)を代入する変数を宣言して値を代入する。
変数を利用して自己紹介を表示する。
表示するデータの中身や表示の仕方は自由とする。
 */
class Question5_1 {
    Question5_1() {
        System.out.printf("%nQuestion5-1%n");
        introduceOneself();
    }

    void introduceOneself() {
        String name = "LIM";
        int age = 36;
        double tall = 180.6;
        char dob = '兎';
        System.out.printf("私の名前は%sです。 年齢は%dで、 身長は%.1fです。 %cの年に生まれました%n",name,age,tall,dob);
    }
}

/*
問題5-2
以下の仕様を参考にメソッド「email」を定義してください。
さらに、定義した目サッドをmain目サッドから呼び出してください。

メソッド名：email
戻り値の型：なし
引数リスト：
    メールのタイトル(String title)
    メールの宛先アドレス(String address)
    メールの本文(String text)
処理内容：
    以下の形式で表示を行う
    {{メールの宛先アドレス}}に、以下のメールを送信しました。
    件名：{{メールのタイトル}}
    本文：{{メールの本文}}
 */
class Question5_2 {
    Question5_2() {
        System.out.printf("%nQuestion5-2%n");
        String title = "案内メールです";
        String address = "eunchong_lim@arena-pro.co.jp";
        String text = "案内をサイト上に更新しています。\n以下のサイトに接続してご確認ください。\nhttps://google.com";
        email(title, address, text);
    }

    public void email(String title, String address, String text) {
        System.out.printf("%sに、以下のメールを送信しました%n",address);
        System.out.printf("件名：%s%n",title);
        System.out.printf("本文：%s%n",text);
    }
}

/*
問題5-3
次の仕様を参考にして、練習5-2のコードにメソッド「email」をオーバーロードし、mainメソッドから呼び出してください。

メソッド名：email
戻り値の型：なし
引数リスト：
    メールの宛先アドレス(String address)
    メールの本文(String text)
処理内容：
    以下の形式で表示を行う
    {{メールの宛先アドレス}}に、以下のメールを送信しました。
    件名：無題
    本文：{{メールの本文}}
 */
class Question5_3 {
    Question5_3() {
        System.out.printf("%nQuestion5-3%n");
        String title = "案内メールです";
        String address = "eunchong_lim@arena-pro.co.jp";
        String text = "案内をサイト上に更新しています。\n以下のサイトに接続してご確認ください。\nhttps://google.com";
        email(address, text);
    }
    public void email(String title, String address, String text) {
        System.out.printf("%sに、以下のメールを送信しました%n",address);
        System.out.printf("件名：%s%n",title);
        System.out.printf("本文：%s%n",text);
    }
    public void email(String address, String text) {
        System.out.printf("%sに、以下のメールを送信しました%n",address);
        System.out.printf("件名：無題%n");
        System.out.printf("本文：%s%n",text);
    }
}

/*
以下の仕様を参考にメソッド「calcTriangleArea」と「calcCircleArea」を作成してください。

メソッド名：calTriangleArea
戻り値の型：三角形の面積(double)
引数リスト：
    三角形の底辺の長さ、単位はcm (double bottom)
    三角形の高さ、単位はcm (double height)
処理内容：
    引数を使用して面積を求め、それを戻す

メソッド名： calcCircleArea
戻り値の型：円の面積(double)
引数リスト：
    円の半径、単位はcm (double radius)
処理内容：
    引数を使用して面積を求め、それを戻す

例)
・三角形の底辺の長さが10.0cm, 高さが5.0cmの場合、面積は25.0cm2
・円の半径が5.0cmの場合、面積は78.5cm2
 */
class Question5_4 {
    Question5_4() {
        System.out.printf("%nQuestion5-4%n");
        System.out.println(calcTriangleArea(10.0, 5.0)+"cm2");
        System.out.println(calcCircleArea(5)+"cm2");
    }

    public double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }

    public double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}

public class Chapter5 {
    public static void main(String[] args) {
        Question5_1 q1 = new Question5_1();
        Question5_2 q2 = new Question5_2();
        Question5_3 q3 = new Question5_3();
        Question5_4 q4 = new Question5_4();
    }
}
