package Study;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class Study {

    class Inner extends Study{

        //field
        private String name;

        //Constructor
        Inner(String name) {
            this.name = name;
        }

        //Method
        public String getName() {
            return this.name;
        }

        @Override
        public void tst() {
            System.out.println("tst by inner");
        }
    }
    public static void main(String[] args) {
        Inner n = new Study().new Inner("James");
        n.tst();

        Study s = n.new Inner("test");
        n.tst();
    }

    //Method
    public void tst() {
        System.out.println("tst");
    }
}

class InitString {
    static class Inner {
        String name;
    }
    public static void main(String[] args) {
        Inner n = new Inner();
        String one = null;
        String two = "null";
        String three = null;
        String four = "null";
        String five = new String("null");

        System.out.println(two == four);
        System.out.println(two == five);
        System.out.println(one == n.name);
    }
}

/*
オーバーライドについて、
1. アクセス修飾子は、ゆるくなるだけ可能。
2. Staticは、同じだけ可能。ただ両方Staticの場合、クラスの型によって動作元が違う。
3. 戻り値は一致する必要あり。一致しなかったらコンパイラー。
4. 名前は一致する必要あり。一致しなかったらただの新しいメソッド。
5. 引数の型と数は一致する必要あり。型が一致しなかったらコンパイラー。数が一致しなかったらオーバーロードになる。
6. 引数の名前はどうでもいい。
 */
class Super {
    protected void print(int b, int a) {
        System.out.println("print super");
    }
}

class Sub extends Super {
    public void print(int a) {
        System.out.println("print sub");
    }

    protected String print(String a, int b) {
        return "string";
    }

    private int print(int a, String b) {
        return 1;
    }

    public int print(long a, String b) {
        return 123;
    }

    public static void main(String[] args) {
        Super a, b;
        a = new Super();
        b = new Sub();
        Sub c = new Sub();

        a.print(1, 2);
        b.print(1, 3);
        c.print(1, 1);
    }
}

/*
Interfaceのルール
<field>
    ・fieldは宣言できるが、すべて[ public static final <T> name = value ]として宣言される
    ・fieldは最低限、[ 型・名・初期化 ]が必要 (public static finalは自動)
<Constructor>
    ・Constructorは宣言できない。
<Method>
    ・Methodは最低限、戻り値・シグネチャが必要。
    ・アクセス修飾子は、[ public, 指定なし(=public), private ] のみ可能
    ・finalはつけられない(interfaceは継承を前提にするため)
    ・default / static を使えば具象Methodを持つことはできる
    　→default => インスタンス化して使う
    　→static => interfaceを呼んで使う
    　→両方組み合わせようとするとコンパイルエラー
    注意) privateで具象Methodを設定できるが・・・使い道は?
 */
interface Inters {
    String name = "";

    void tester();
}

class Intermain implements Inters {
    public static void main(String[] args) {
        Inters i = new Intermain();
        i.tester();
    }

    public void tester() {
        System.out.println("override");
    }
}

//static methodからはstatic methodのみ呼び込み可能
class sutdy_static {
    public static void main(String[] args) {
        stater();
    }

    static void stater() {
        System.out.println("stater");
    }

    void call() {
        System.out.println("call");
    }

    @testing(e = ElementType.METHOD)
    public void next() {
        call();
    }
}


@Target(ElementType.METHOD)
@interface testing {
   ElementType e();
}

/*
配列の場合、newで宣言されると初期化されるので、値が入っていなくても動作する。
ArrayListなどはout of bouns Exceptionが発生する (Sizeが0なので)
 */
class InitArray {
    public static void main(String[] args) {
        String[] strs = new String[3];
        System.out.println(strs[0]);

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}

class checkForTypeOfException {
    public static void main(String[] args) {
        String[] array = {"asdfa", "asd", "brw"};
        String[] array2 = new String[3];
        int i = 0;
        try {
            for (String s : array) {
                array2[i] = s.substring(1, 4);
                i++;
            }
        } catch (Exception e) {
            System.out.println(e.getClass().toString());
        }
    }
}

/*
For文の動き方確認
 */
class ArrayTest {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
        for (int i = 0; i < list.length; i+=2) {
            System.out.println(list[i]);
        }
    }
}

class OutOfMemoryTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("hello");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getName());
            System.out.println("it is RuntimeException / 非検査例外 / 検査しなくてもコンパイルできる");
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
            System.out.println("it is Exception without RuntimeException / 検査例外 / 検査しないとコンパイルできない");
            /*
            IOException
            SQLException
            InterruptedException
            ClassNotFoundException
             */
        } catch (Error e) {
            System.out.println(e.getClass().getName());
            System.out.println("it is Error / エラー / 発生してもどうしようもないもの");
        }
    }
}










