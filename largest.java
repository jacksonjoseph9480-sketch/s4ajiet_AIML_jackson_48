public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 100, 45};
        int largest = java.util.Arrays.stream(arr).max().getAsInt();
        System.out.println(largest);
    }
}
