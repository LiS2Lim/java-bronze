package Study;

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