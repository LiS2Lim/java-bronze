class Question17_1 extends Questions {
    Question17_1() {
        super("""
                次のようなプログラムを作成・実行し、実行時エラーを発生させてください。
                ①String型変数sを宣言し、nullを代入する
                ②s.length()の内容を表示しようとする。
                
                回答：
                    public class Main {
                        public static void main(String[] args) {
                            String s = null;
                            System.out.println(s.length());
                        }
                    }
                """);
    }
}
class Question17_2 extends Questions {
    Question17_2() {
        super("""
                練習17-1で作成したコードを、try-catch文を用いて例外処理するよう修正してください。
                また、例外処理では次の動作を行ってください。
                ①「NullPointerException例外をcatchしました」と表示する
                ②「ーースタックトレース(ここから)ーー」と表示する
                ③スタックトレースを表示する
                ④「ーースタックトレース(ここまで)ーー」と表示する
                
                回答：
                    try {
                        String s = null;
                        System.out.println(s.length());
                    } catch (NullPointerException ex) {
                        System.out.println("NullPointerException例外をcatchしました");
                        System.out.println("ーースタックトレース(ここから)ーー");
                        ex.printStackTrace();
                        System.out.println("ーースタックトレース(ここまで)ーー");
                    }
                """);
    }
}
class Question17_3 extends Questions {
    Question17_3() {
        super("""
                Integer.parseIntメソッドを実行し、文字列"三"の変換結果をint型変数iに代入するコードを記述してください。
                その際に、parseIntメソッドがどのような例外を発生させる可能性があるかをAPリファレンスで調べ、正しく例外処理を記述してください。I
                
                回答：
                    try {
                        int i = Integer.parseInt("三");
                        System.out.println(i);
                    } catch (NumberFormatException e) {
                        System.out.println("例外が発生 : " + e.getMessage());
                    }
                """);
    }
}
class Question17_4 extends Questions {
    Question17_4() {
        super("""
                起動直後にIOExceptionを送出して異常終了するようなプログラムを作成してください。
                
                回答：
                    public class Main {
                        public static void main(String[] args) throws IOException {
                            Main.io();
                        }

                        public static void io() throws IOException {
                            throw new IOException();
                        }
                    }
                """);
    }
}
public class Chapter17 {
    public static void main(String[] args) {
        Questions q1 = new Question17_1();
        Questions q2 = new Question17_2();
        Questions q3 = new Question17_3();
        Questions q4 = new Question17_4();
    }
}
