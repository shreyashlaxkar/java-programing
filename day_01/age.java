import java.util.Scanner;

public class age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age:");
        int age = sc.nextInt();
        System.out.println("Your age is:" +age);
        sc.close();
    }
}