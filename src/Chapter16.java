class Question16_1 extends Questions {
    Question16_1() {
        super("""
                次の各情報を格納する適切なコレクションをList, Set, Mapの中から選んでください。
                ①日本の47都道府県の名前(順序は不問)
                ②5人の生徒のテストの点数
                ③過去の総理大臣の名前と任期(順序は不問)
                
                回答：
                    ①HashSet<String>
                    ②HashMap<String, Integer>
                    ③HashMap<String, String>
                """);
    }
}

class Question16_2 extends Questions {
    Question16_2() {
        super("""
                次のようなHeroクラスがあります。
                public class Hero {
                    private String name;
                    public Hero(String name) { this.name = name; }
                    public String getName() { return this.name; }
                }
                2人の勇者(斎藤、鈴木)をHeroとしてインスタンス化してArrayListに格納し、1人ずつ順番に取り出して名前を表示するプログラムを作成してください。
                
                回答：
                    ArrayList<Hero> heros = new ArrayList<>();
                    Hero saito = new Hero("斎藤");
                    Hero suzuki = new Hero("鈴木");
                    heros.add(saito);
                    heros.add(suzuki);
                    
                    for (Hero h: heros) {
                        System.out.println(h.getName());
                    }
                
                """);
    }
}

class Question16_3 extends Questions {
    Question16_3() {
        super("""
                練習16-2の二人の勇者をインスタンス化し、それぞれの勇者が倒した敵の数(3,7)と勇者をペアでコレクションに格納してください。
                次に1つずつ取り出し、次のような画面表示を行ってください。
                
                斎藤が倒した敵＝3
                鈴木が倒した敵＝7
                
                回答：
                    Hero saito = new Hero("斎藤");
                    Hero suzuki = new Hero("鈴木");
                    HashMap<Hero, Integer> map = new HashMap<>();
                    map.push(saito, 3);
                    map.push(suzuki, 7);
                    
                    for(Hero h: map.keySet()) {
                        System.out.println(h.getName() + "が耐えした敵＝" + map.get(h));
                    }
                """);
    }
}

public class Chapter16 {
    public static void main(String[] args) {
        Questions q1 = new Question16_1();
        Questions q2 = new Question16_2();
        Questions q3 = new Question16_3();
    }
}
