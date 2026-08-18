import java.util.Scanner;

class students{
    String name;
    int age, rollno, marks;
     void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        name = sc.nextLine();
        System.out.println("Enter Your age:");
        age = sc.nextInt();
        System.out.println("Enter Your roll number:");
        rollno = sc.nextInt();
        System.out.println("Enter Your marks:");
        marks = sc.nextInt();
        sc.close();
     }

     void display(){
        System.out.println("Your name is:" +name);
        System.out.println("Your age is:" +age);
        System.out.println("Your roll number is:" +rollno);
        System.out.println("Your marks are:" +marks);
     }
}
 
 public class studentdetails{
    public static void main(String[] args) {
        students s1 = new students();
        s1.input();
        s1.display();
    }