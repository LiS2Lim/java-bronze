package Study;

public class Study {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println(list[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
