import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

class Question15_1 extends Questions {
    Question15_1() {
        super("""
                1～100までの整数をカンマで連結した以下のような文字列sを生成するコードを作成してください。
                1,2,3,4,5,6,7...98,99,100
                また、完成した文字列sをカンマで分割し、String配列aに格納してください。
                
                回答：
                public String makeText() {
                    String s = "";
                    for (int i = 1; i <= 100; i++) {
                        s += i + ",";
                    }
                    return s;
                }
                
                String s = makeText();
                String[] a = s.split(",");
                """);
    }
    public String makeText() {
        String s = "";
        for (int i = 1; i <= 100; i++) {
            s += i + ",";
        }
        return s;
    }

    public String makeText2() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }
        return sb.toString();
    }
}
class Question15_2 extends Questions {
    Question15_2() {
        super("""
                フォルダ名が入っている変数folderと、ファイル名が入っている変数fileがあります。
                fileは必ず「readme.txt」のような形式をしていますが、folderは末尾に/記号がついている場合とついていない場合の両方がありえます。
                例えば、「c:/javadev」や「c:/user/」のどちらもfolderの値として考えられます。
                folderとfileを連結して、「c:/javadev/readme.txt」のような完全なファイル名としての文字列を完成させるメソッドを作成してください。
                
                回答：
                public String makeFullFalderName(String folderName) {
                    String result;
                    if (folderName.charAt(folderName.length()-1) == '/') {
                        result = folderName;
                    } else {
                        result = folderName + "/";
                    }
                    return result;
                }
                
                public String makeAddress(String folderName, String fileName) {
                    return makeFullFalderName(folderName) + fileName;
                }
                
                """);
    }

    public String makeFullFalderName(String folderName) {
        String result;
        if (folderName.charAt(folderName.length()-1) == '/') {
            result = folderName;
        } else {
            result = folderName + "/";
        }
        return result;
    }
    public String makeAddress(String folderName, String fileName) {
        return makeFullFalderName(folderName) + fileName;
    }

    public String concatPath(String folder, String file) {
        if (!folder.endsWith("/")) {
            folder += "/";
        }
        return folder + file;
    }
}
class Question15_3 extends Questions {
    Question15_3() {
        super("""
                以下の各条件とマッチする正規表現パターンを記述してください。
                ①すべての文字列
                ②最初の1文字はA、2文字目は数字、3文字目は数字か無し
                ③最初の1文字はU、2～4文字目は英大文字
                
                回答：
                ①(".+");
                ②("A\\d{1,2}");
                ③("U[A-Z]{3}");
                """);
    }
}
class Question15_4 extends Questions {
    Question15_4() {
        super("""
                mainメソッドのみを持つクラスMainを定義し、以下の手順を参考にして「現在の100日後の日付」を「西暦2020年09月24日」という形式で表示するプログラムを作成してください。
                ①現在の日時をDate型で取得します
                ②取得した日時情報をCalendarにセットします
                ③Calendarから「日」の数値を取得します
                ④取得した値に100を足した値をCalendarの「日」にセットします
                ⑤Calendarの日時情報をDate型に変換します
                ⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示します
                
                回答：
                    Date d = new Date();
                    Calendar c = Calendar.getInstance();
                    c.setTime(d);
                    int day = c.get(Calendar.DAY_OF_MONTH);
                    c.set(Calendar.DAY_OF_MONTH,day + 100);
                    d = c.getTime();
                    String now = new SimpleDateFormat("西暦yyyy年MM月dd日(E) HH:mm:ss").format(d);
                    System.out.println(now);
                """);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) + 100);
        Date d = c.getTime();
        String now = new SimpleDateFormat("西暦yyyy年MM月dd日(E) HH:mm:ss").format(d);
        System.out.println(now);
    }
}
class Question15_5 extends Questions {
    Question15_5() {
        super("""
                練習15-4と同様の動作を行うプログラムを、TimeAPIを用いて作成してください。
                
                回答：
                """);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日(E) HH:mm:ss");
        String ltime = LocalDateTime.now().plusDays(100).format(dateFormat);
        System.out.println(ltime);
    }
}
public class Chapter15 {
    public static void main(String[] args) {
        Question15_1 q1 = new Question15_1();
        System.out.println(q1.makeText());
        System.out.println(q1.makeText2());
        String[] a = q1.makeText().split(",");
        System.out.println(a.length);

        Question15_2 q2 = new Question15_2();
        System.out.println(q2.makeAddress("c:/javadev","readme.txt"));

        Questions q3 = new Question15_3();
        System.out.println("a@asdf.co.kr".matches("\\w+@\\w+\\.[a-zA-Z_.0-9]*"));

        Questions q4 = new Question15_4();
        Questions q5 = new Question15_5();
    }
}
