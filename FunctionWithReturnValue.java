import java.util.Scanner;

public class FunctionWithReturnValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n = 5;
        int fun = MySolution.returnValue(n);
        System.out.println(fun);
        sc.close();

    }
}

class MySolution{
    public static int returnValue(int num){
        return num * 2;
    }
}