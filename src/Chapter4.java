/*
問題4-1
次の条件を満たす各配列を準備するプログラムを作成してください。
なお、以下の4つの配列を1つのプログラムの中に記述して構いません、
また、値の初期化は不要です。
①int型の値を4個まとめて格納できる配列points
②double型の値を5個まとめて格納できる配列weights
③boolean型の値を3つまとめて格納できる配列answers
④String型の値を3つまとめて格納できる配列names
 */
class Question4_1 {
    Question4_1() {
        System.out.printf("%nQuestion4-1%n");

        //①int型の値を4個まとめて格納できる配列points
        int[] points = new int[4];
        System.out.println(points.getClass().getSimpleName() + ":" + points.length);

        //②double型の値を5個まとめて格納できる配列weights
        double[] weights = new double[5];
        System.out.println(weights.getClass().getSimpleName() + ":" + weights.length);

        //③boolean型の値を3つまとめて格納できる配列answers
        boolean[] answers = new boolean[3];
        System.out.println(answers.getClass().getSimpleName() + ":" + answers.length);

        //④String型の値を3つまとめて格納できる配列names
        String[] names = new String[3];
        System.out.println(names.getClass().getSimpleName() + ":" + names.length);
    }
}

/*
問題4-2
次に示す3つの条件を満たすプログラムを作成してください。
①3つの口座残高「121902」「8302」「55100」が格納されているint型配列
②その配列の要素を1つずつfor分で取り出して画面に表示します
③同じ配列の要素を拡張for分で1つずつ取り出して画面に表示します
 */
class Question4_2 {
    Question4_2() throws NoSuchFieldException {
        System.out.printf("%nQuestion4-2%n");

        //①3つの口座残高「121902」「8302」「55100」が格納されているint型配列
        int[] moneyList = {121902, 8302, 55100};

        //②その配列の要素を1つずつfor分で取り出して画面に表示します
        System.out.println("for文");
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(i + ":" + moneyList[i]);
        }

        //③同じ配列の要素を拡張for分で1つずつ取り出して画面に表示します
        int j = 0;
        System.out.println("拡張for文");
        for (int i : moneyList) {
            System.out.println(j++ + ":" + i);
        }
    }
}

/*
問題4-3
次のコードを実行すると、5行目と6行目で例外が発生します。
それぞれの行で発生する例外の名前を答えてください。

public class Main {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = {171.3F, 175.0F};
        System.out.println(counts[1]);
        System.out.println(heights[2]);
    }
}
 */
class Question4_3 {
    Question4_3() {
        System.out.printf("%nQuestion4-3%n");
        System.out.println("NullPointerException");
        System.out.println("ArrayIndexOutOfBoundsException");
    }
}

/*
問題4-4
次の条件を満たす「数あてクイズ」のプログラムを作成してください
①int型で要素数3の配列numbersを準備します。
　このとき初期化はそれぞれ「3」「4」「9」とします。
②画面に「1桁の数字を入力してください」と表示します
③次のコードを用いてキーボードから数字の入力を受け付け、変数inputに代入します。
④配列をループで回しながら、いずれかの要素と等しいかを調べます。
　もし等しければ「アタリ！」と表示します。
 */
class Question4_4 {
    Question4_4() {
        System.out.printf("%nQuestion4-4%n");

        //①int型で要素数3の配列numbersを準備します。
        //　このとき初期化はそれぞれ「3」「4」「9」とします。
        int[] numbers = {3, 4, 9};

        //②画面に「1桁の数字を入力してください」と表示します
        System.out.println("1桁の数字を入力してください");

        //③次のコードを用いてキーボードから数字の入力を受け付け、変数inputに代入します。
        int input = 0;
        try {
            input = new java.util.Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        //④配列をループで回しながら、いずれかの要素と等しいかを調べます。
        //　もし等しければ「アタリ！」と表示します。
        for (int i : numbers) {
            if (i == input) {
                System.out.println("アタリ！");
                break;
            }
        }

    }
}


public class Chapter4 {
    public static void main(String[] args) {
        try {
            Question4_1 q1 = new Question4_1();
            Question4_2 q2 = new Question4_2();
            Question4_3 q3 = new Question4_3();
            Question4_4 q4 = new Question4_4();
        } catch (Exception e) {
           System.err.println(e.toString());
        }
    }
}
