import java.util.*;
public class SwapUsingThird{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a = sc.nextInt();
  
  System.out.print("Enter B:");
  int b = sc.nextInt();
  
  int temp = a;
  a = b;
  b = temp;
  
  System.out.print("A:" +a+ ",B:" +b);
  }
}