import java.util.Scanner;

public class LastDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LastDigit.utility(num);
        sc.close();
    }
}

class LastDigit {
    static void utility(int n) {
        // just complete below statement
        int ans = Math.abs(n%10);
            // below statement print the result
            System.out.println(ans);
    }
}