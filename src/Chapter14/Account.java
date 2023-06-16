package Chapter14;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //①口座番号4649、残高1592円のAccountインスタンスを変数aに生成し、「System.out.println(a);」を実行すると、画面に「￥1592(口座番号：4649)」と表示される。
    @Override
    public String toString() {
        return "￥" + this.balance + "(口座番号：" + this.accountNumber + ")";
    }

    //②口座番号が等しければ等価と判断される。ただし、「 4649」など、口座番号の先頭に半角スペースがつけられた場合でも、それを無視して比較できる
    @Override
    public boolean equals(Object o) {
        String target = o.toString();
        String origin = this.accountNumber.trim();
        if (o instanceof Account) { target = ((Account)o).accountNumber.trim(); }
        if (o instanceof String) { target = ((String)o).trim(); }
        return target.equals(origin);
    }
}
