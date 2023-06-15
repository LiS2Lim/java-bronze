class Question11_1 extends Questions {
    Question11_1() {
        super("""
                ある会社では、会社の資産として保有するものを管理するプログラムを作ろうとしています。
                現時点では「コンピュータ」「本」を表す、次のような2つのクラスがあります。
                
                今後、コンピュータと本以外にも、様々な形ある資産を管理していきたい場合は、有用な「有形資産(TangibleAsset)」という名前の抽象クラスを作成してください。
                またComputerやBookは、その親クラスを用いた形に修正してください。
                
                回答：
                abstract public class TangibleAsset {
                    String name;
                    int price;
                    String color;

                    public TangibleAsset(String name, int price, String color) {
                        this.name = name;
                        this.price = price;
                        this.color = color;
                    }
                    
                    public String getName() { return this.name; }
                    public int getPrice() { return this.price; }
                    public String getColor() { return this.color; }
                }
                """) ;
    }
}

class Question11_2 extends Questions {
    Question11_2() {
        super("""
                問題11-1の会社では、形のない「無形資産(IntangibleAsset)」も管理しようと考えています。
                無形資産には、例えば特許権(Patent)などがあります。
                無形資産も有形資産も資産(Asset)の一種です。
                この前提に従って、次の継承ツリーの(ア)～(ウ)に当てはまるクラス名を考えてください。
                (ア)
                TangibleAsset   (イ)
                Computer        Book    (ウ)
                また、(ア)に入る抽象クラスを開発し、このクラスを継承するようにTangibleAssetを修正してください。
                
                回答：
                    (ア)Asset
                    (イ)IntangibleAsset
                    (ウ)Patent
                """) ;
    }
}

class Question11_3 extends Questions {
    Question11_3() {
        super("""
                資産かどうかとは関わりなく、形があるもの(Thing)であれば「重さ」を得ることができるはずです。
                そこで、double型の重さを取得するメソッドgetWeight()とdouble型の重さを設定するメソッドsetWeight()を持つインタフェースThingを定義してください。
                
                public interface Thing {
                    double getWeight();
                    void setWeight(double weight);
                }
                """) ;
    }
}

class Question11_4 extends Questions {
    Question11_4() {
        super("""
                有形資産(TangibleAsset)は、資産(Asset)の一種でもありますし、形のあるもの(Thing)の一種でもあります。
                この定義に沿うようにTangibleAssetのソースコードを修正してください。
                この際、TangibleAssetにフィールドにメソッドの追加が必要であれば、追加してください。
                """) ;
    }
}

public class Chapter11 {
    public static void main(String[] args) {
        Question11_1 q11_1 = new Question11_1();
        Question11_2 q11_2 = new Question11_2();
        Question11_3 q11_3 = new Question11_3();
        Question11_4 q11_4 = new Question11_4();
    }
}