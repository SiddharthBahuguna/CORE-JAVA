import java.util.*;
public class MinimumBetweenTwoNumbers{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a=sc.nextInt();
  
  System.out.print("Enter B:");
  int b=sc.nextInt();

  if(a>b){
  System.out.print("Minimum is:"+b);
  }
  else{
  System.out.print("Minimum is:"+a);
  }
 }
}