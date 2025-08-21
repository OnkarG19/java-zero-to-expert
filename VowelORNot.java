import java.util.Scanner;

public class VowelORNot {
    public static void main(String[] args) {
        //char ch = 'z';
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str = Solution.isVowel(ch);
        // We are calling the method isVowel from the Solution class.
        // ch (which is 'z') is passed as an argument.
        // Whatever isVowel(ch) returns (either "YES" or "NO") is stored in the variable str.
        System.out.println(str);
        sc.close();
    }
    
}
class Solution{
    static String isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return "YES";
        }
        else{
            return "NO";
        }

    }
}