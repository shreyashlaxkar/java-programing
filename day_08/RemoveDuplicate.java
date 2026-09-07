import java.util.*;
public class RemoveDuplicate{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Array after removing duplicates: ");
    for(int i = 0; i < n; i++){
      boolean duplicate = false;
      for(int j = 0;j < i;j++){
        if(arr[i] == arr[j]){
          duplicate = true;
          break;
        }
      }
      if(!duplicate){
      System.out.print(arr[i] + " ");
    }
    }
  }
}