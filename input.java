import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner zoe = new Scanner(System.in);
        double a;
        double b;
        double answer;
        System.out.println("Enter first num" );
        a = zoe.nextDouble();
        System.out.println("Enter second num" );
        b = zoe.nextDouble();
        answer=a+b;
        System.out.println(answer);
    };
}
