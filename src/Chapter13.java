import Chapter13.*;

class Question13_1 extends Questions {
    Question13_1() {
        super("""
                次の2つのクラスWizardとWandに宣言されているすべてのフィールドとメソッドについて、カプセル化の定石に従ってすくセス修飾子を追加してください。
                
                回答：コード作成しているので省略
                
                """);
    }
}

class Question13_2 extends Questions {
    Question13_2() {
        super("""
                問題13-1で作成したプログラムをコンパイルすると、エラーが発生します。
                発生するエラーの内容とその原因を答えてください。
                
                回答：this.wand.powerの部分のアクセスエラー。
                    privateに変更しているため、ゲッターで値を取得する必要がある。
                """);
    }
}

class Question13_3 extends Questions {
    Question13_3() {
        super("""
                問題13-2で回答したエラーを解決するために、問題13-1で作成したプログラムにgetterメソッドとsetterメソッドを追加してください。
                
                回答：コード作成しているので省略
                """);
    }
}

class Question13_4 extends Questions {
    Question13_4() {
        super("""
                問題13-3で作成したWizardクラスとWandクラスのsetterメソッドについて、次の4つのルールに従って引数の妥当性検証を追加してください。
                引数が妥当でない場合には「throws new IlligalArgument Exception」を用いて何らかのエラーメッセージを表示し、プログラムを中断してください。
                
                ①魔法使いや杖の名前には、必ず3文字以上を指定する
                ②杖による増幅率は、0.5以上100以下である
                ③魔法使いは必ず杖を装備する
                ④魔法使いのHPとMPは0以上である。ただし、HPについては、負の値をセットしようとした場合には、自動的に0が設定される。
                """);
    }
}

public class Chapter13 {
    public static void main(String[] args) {
        Questions q1 = new Question13_1();
        Wand wd = new Wand();
        wd.setName("スーパーワンド");
        wd.setPower(10.0);
        Wizard w = new Wizard(wd);
        Hero h = new Hero();
        w.heal(h);

        Questions q2 = new Question13_2();
        Questions q3 = new Question13_3();
        Questions q4 = new Question13_4();
    }
}
