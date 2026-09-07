import java.util.*;
public class CharacterCount {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int[] count = new int[256];

    for(int i = 0;i < str.length();i++){
      char ch = str.charAt(i);
      count[ch]++;
    }

    System.out.println("Character frequency : ");
    for(int i = 0;i < 256;i++){
      if(count[i] > 0){
        System.out.println((char)i + " = " + count[i]);
      }
    }
    sc.close();
  }
}