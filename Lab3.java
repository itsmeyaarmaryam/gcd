package lab3;
import java.util.*;
public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int gcd = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);}
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;}
        return gcd(b, a % b); } }



    

