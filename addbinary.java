import java.math.BigInteger;
import java.util.Scanner;

public class addbinary {
    public static String addBinary(String a, String b) {
        
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        
        BigInteger sum = num1.add(num2);

        String result = sum.toString(2);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        String a = sc.nextLine();

        System.out.println("Enter the value of b:");
        String b = sc.nextLine();

        String result = addBinary(a, b);
        System.out.println("Result: " + result);
    }
}
