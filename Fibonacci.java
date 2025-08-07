public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < 5; i++) {
            int next = n1 + n2;
            System.out.print(" " + next);
            n1 = n2;
            n2 = next;
        }
    }
}