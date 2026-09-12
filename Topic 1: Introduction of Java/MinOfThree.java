import java.util.*;
public class MinOfThree{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a=sc.nextInt();
  
  System.out.print("Enter B:");
  int b=sc.nextInt();

  System.out.print("Enter C:");
  int c=sc.nextInt();
  
  if(b>a && c>a){
  System.out.print("Minimum is:"+a);
  }
  
  else if(a>b && c>b){
  System.out.print("Minimum is:"+b);
  }
  
  else{
  System.out.print("Minimum is:"+c);
  }
 }
}