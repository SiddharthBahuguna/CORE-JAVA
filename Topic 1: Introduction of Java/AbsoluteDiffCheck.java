import java.util.*;
public class AbsoluteDiffCheck{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a=sc.nextInt();

  System.out.print("Enter B:");
  int b=sc.nextInt();

  int absDiff=Math.abs(a-b);
  
  if(absDiff > 10){
  System.out.print("The difference is greater than 10");
  }
  
  else{
  System.out.print("Difference is not greater than 10");
  }
 }
}
