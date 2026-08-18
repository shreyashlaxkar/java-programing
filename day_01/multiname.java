import java.util.Scanner;

public class names{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name:");
        String name1 = sc.nextLine();

        System.out.println("Enter Second name:");
        String name2 = sc.nextLine();

        System.out.println("Enter third name:");
        String name3 = sc.nextLine();

        System.out.println("Enter Fourth name:");
        String name4 = sc.nextLine();

        System.out.println("Enter Fifth name:");
        String name5 = sc.nextLine();

        System.out.println("The names are:");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        sc.close();
    }
}