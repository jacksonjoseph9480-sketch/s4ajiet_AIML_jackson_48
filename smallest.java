public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 1, 99, 45};
        int smallest = java.util.Arrays.stream(arr).min().getAsInt();
        System.out.println(smallest);
    }
}
