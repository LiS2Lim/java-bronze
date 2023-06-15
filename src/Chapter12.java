import Chapter12.*;

class Question12_1 extends Questions {
    Question12_1() {
        super("""
                次の図中の四角に入る適切なクラス名を教えてください。
                
                回答：
                1-1)Sword
                1-2)Item
                1-3)Sword
                1-4)Item
                2-1)Monster
                2-2)Slime
                2-3)Slime
                2-4)Monster
                """);
    }
}

class Question12_2 extends Questions {
    Question12_2() {
        super("""
                次のようにクラスが宣言されています。
                
                public final class A extends Y {
                    public void a() { System.out.print("Aa"); }
                    public void b() { System.out.print("Ab"); }
                    public void c() { System.out.print("Ac"); }
                }
                
                public class B extends Y {
                    public void a() { System.out.print("Ba"); }
                    public void b() { System.out.print("Bb"); }
                    public void c() { System.out.print("Bc"); }
                }
                
                public interface X {
                    void a();
                };
                
                public abstract class Y implements X {
                    public abstract void a();
                    public abstract void b();
                }
                
                のこと時、次の問いに答えてください。
                
                ①「X obj = new A();」としてAインスタンスを生成した後、変数objに対して呼ぶことができるメソッドをa(), b(), c()の中からすべてあげてください。
                回答：a()のみ可能。
                
                ②「Y y1 = new A(); Y y2 = new B();」としてAとBのインスタンスを生成した後、「y1.a(); y2.a();」を実行した場合に画面に表示される内容を答えてください。
                回答：AaBa
                """);
    }
}

class Question12_3 extends Questions {
    Question12_3() {
        super("""
                練習12-2で用いたAクラスやBクラスのインスタンスをそれぞれ1つずつ生み出し、要素数2からなる単一の配列に格納するとします。
                格納した後には配列の中身をループで順に取り出し、それぞれのインスタンスのb()を呼ぶ必要があります。
                以上の前提に基づき、次の問いに答えてください。
                
                ①配列変数の型としては何を用いるべきか答えてください。
                回答：Y
                
                ②問題文に記述された内容のプログラムを作成してください。
                
                public class Main {
                    public static void main(String[] args) {
                        Y[] arr = new Y[2];
                        arr[0] = new A();
                        arr[1] = new B();
                        for (Y y : arr) {
                            y.b();
                        }
                    }
                }
                """);
    }
}

public class Chapter12 {
    public static void main(String[] args) {
        Questions q1 = new Question12_1();
        Questions q2 = new Question12_2();
        Questions q3 = new Question12_3();
    }
}
