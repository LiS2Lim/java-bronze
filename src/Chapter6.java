/*
問題6-1
次のソースコードを3つのクラスに文割することを考えます。

public class Main {
    public static void main(String[] args) {
        doWarusa();
        doTogame();
        callDeae();
        showMondokoro();
    }
    public static void doWarusa() {
        System.out.println("きなこでござる。食えませんかの。");
    }
    public static void doTogame() {
        System.out.println("この老いぼれの目はごまかせませんぞ。");
    }
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws Exception {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋章が目にはいらぬか！");
        doTogame(); //もう一度、とがめる
    }
}

次のルールに従い、このクラスを3つのクラスに文割してください。
①commentパッケージに属するZenhanクラスを作成し、前半に実行される2つのメソッドを移動する
②commentパッケージに属するKouhanクラスを作成し、後半に実行される2つの目サッドを移動する
③デフォルトパッケージに属するMainクラスにはmainメソッドだけを残す
　そして、このクラスの先頭にはZenhanクラスだけをインポートする。
 */
class Question6_1 {
    Question6_1() {
        System.out.printf("%nQuestion6-1%n");
        String ans = """
            <Zenhan.java>---------------------------------------
            package comment;
            
            public class Zenhan {
                public static void doWarusa() {
                    System.out.println("きなこでござる。食えませんかの。");
                }
                public static void doTogame() {
                    System.out.println("この老いぼれの目はごまかせませんぞ。");
                }
            }
            <Kouhan.java>---------------------------------------
            package comment;
            
            public class Kouhan {
                public static void callDeae() {
                    System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
                }
                public static void showMondokoro() throws Exception {
                    System.out.println("飛車さん、角さん。もういいでしょう。");
                    System.out.println("この紋章が目にはいらぬか！");
                    comment.Zenhan.doTogame(); //もう一度、とがめる
                }
            }
            <Main.java>---------------------------------------
            import comment.Zenhan;
            
            public class Main {
                public static void main(String[] args) throws Exception {
                    Zenhan.doWarusa();
                    Zenhan.doTogame();
                    comment.Kouhan.callDeae();
                    comment.Kouhan.showMondokoro();
                }
            }
            """;
        System.out.println(ans);
    }
}

/*
問題6-2
練習6-1で文割した各ソースファイルをコンパイルし、完成した3つのクラスファイルを適切なフォルダにコピーしてください。
そのうえで、Javaコマンドを実行し、プログラムを正常に動作させてください。
 */
class Question6_2 {
    Question6_2() {
        System.out.printf("%nQuestion6-2%n");
        System.out.println("""
                mkdir comment
                mv Zenhan.java ./comment/
                mv Kouhan.java ./comment/
                javac Main.java
                java Main
                """);
    }
}

/*
問題6-3
showMondokoroメソッドを修正し、「この紋章が目に入らぬか！」の後に3秒間の「待ち時間」を入れます。
APIリファレンスでjava.lang.Treadクラスを調べ、プログラムを一時的に止めるメソッドを呼び出すよう修正してください。
 */
class Question6_3 {
    Question6_3() {
        System.out.printf("%nQuestion6-3%n");
        String ans = """
            <Zenhan.java>---------------------------------------
            package comment;
            
            public class Zenhan {
                public static void doWarusa() {
                    System.out.println("きなこでござる。食えませんかの。");
                }
                public static void doTogame() {
                    System.out.println("この老いぼれの目はごまかせませんぞ。");
                }
            }
            <Kouhan.java>---------------------------------------
            package comment;
            
            public class Kouhan {
                public static void callDeae() {
                    System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
                }
                public static void showMondokoro() throws Exception {
                    System.out.println("飛車さん、角さん。もういいでしょう。");
                    System.out.println("この紋章が目にはいらぬか！");
                    java.lang.Thread.sleep(10 * 1000); // 10秒待機
                    comment.Zenhan.doTogame();
                }
            }
            <Main.java>---------------------------------------
            import comment.Zenhan;
            
            public class Main {
                public static void main(String[] args) throws Exception {
                    Zenhan.doWarusa();
                    Zenhan.doTogame();
                    comment.Kouhan.callDeae();
                    comment.Kouhan.showMondokoro();
                }
            }
            """;
        System.out.println(ans);
    }
}

/*
問題6-4
Windowsの環境変数CLASSPATHとして、「c:\work\ex64」が設定されているとします。
この時、現在のフォルダによらず、「java. Main」というコマンドで練習6-3のプログラムが動作するには、Main.class, Zhenhan.class, Kouhan.classを、どのフォルダに配置すればよいか答えてください。
 */
class Question6_4 {
    Question6_4() {
        System.out.printf("%nQuestion6-4%n");
        String ans = """
                mv Main.class c:/work/ex64/
                mkdir c:/work/ex64/comment
                mv ./comment/Zenhan.java c:/work/ex64/comment/
                mv ./comment/Kouhan.java c:/work/ex64/comment/
                rm -rf comment
                """;
        System.out.println(ans);
    }
}

/*
問題6-5
「Java Main」というコマンドを実行すると、練習6-3のプログラムが動作するWindowsコンピューターがあります。
また、このコンピューターのZenhan.classは、「c:/javaapp/koumon/comment」というフォルダの中に存在します。
この時環境変数CLASSPATHとして設定されている内容を答えてください。
 */
class Question6_5 {
    Question6_5() {
        System.out.printf("%nQuestion6-5%n");
        String ans = """
                c:/javaapp/koumon
                """;
        System.out.println(ans);
    }
}

public class Chapter6 {
    public static void main(String[] args) {
        Question6_1 q1 = new Question6_1();
        Question6_2 q2 = new Question6_2();
        Question6_3 q3 = new Question6_3();
        Question6_4 q4 = new Question6_4();
        Question6_5 q5 = new Question6_5();
    }
}
