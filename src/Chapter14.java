import Chapter14.*;
import static java.lang.System.out;

class Question14_1 extends Questions {
    Question14_1() {
        super("""
                口座番号を表すString型フィールドaccountNumberと、残高を表すint型フィールドbalnceを持つ銀行口座クラスを作ってください。
                残高を表すint型フィールドblanceを持つ銀行口座クラスを作ってください。
                さらに、このクラスにメソッド宣言を追加し、次の①と②の条件を満たすように修正してください。
                ①口座番号4649、残高1592円のAccountインスタンスを変数aに生成し、「System.out.println(a);」を実行すると、画面に「￥1592(口座番号：4649)」と表示される。
                ②口座番号が等しければ等価と判断される。ただし、「 4649」など、口座番号の先頭に半角スペースがつけられた場合でも、それを無視して比較できる
                
                回答：コードで作成しているので、省略
                """);
    }
}
class Question14_2 extends Questions {
    Question14_2() {
        super("""
                第八章の練習問題で作成したClericクラスでは、各インスタンスごとに最大HPと最大MPの情報を保持しています。
                しかし、すべてのClericの最大HPは50、最大MPは10と決まっており、各インスタンスがそれぞれの譲歩を持たずに済むように改良したいと考えています。
                そこで、最大HP、最大MPのフィールドが各インスタンスに保持されないよう、フィールド宣言に適切なキーワードを追加して下さい。
                
                回答：
                private static int maxHp = 50;
                private static int maxMp = 10;
                """);
    }
}
public class Chapter14 {
    public static void main(String[] args) {
        Questions q1 = new Question14_1();
        Account a = new Account("4649",1592);
        Account b = new Account(" 4649",123);
        out.println(a);
        out.println(a.equals(" 4649"));

        Questions q2 = new Question14_2();
    }
}
