import java.util.*;
public class MaxOfThree{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a=sc.nextInt();
  System.out.print("Enter B:");
  int b=sc.nextInt();
  System.out.print("Enter C:");
  int c=sc.nextInt();

  if(a>b && a>c){
  System.out.print("Maximum:"+a);
  }
  else if(b>c && b>a){
  System.out.print("Maximum:"+b);
  }
  else{
  System.out.print("Maximum:"+c);
  }
 }
}