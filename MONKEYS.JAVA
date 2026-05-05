public class Main {
    public static void main(String[] args) {
        int n = 20;
        int k = 2;
        int j = 3;
        int m = 13;
        int p = 13;

        int y = m / k;
        int z = p / j;
        int x = n - (y + z);

        System.out.println("monkey left on tree: " + x);
    }
}
