import java.util.*;
public class MaximumBetweenTwoNum{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a=sc.nextInt();

  System.out.print("Enter B:");
  int b=sc.nextInt();
  
  if(a>b){
  System.out.print("Maximum:"+a);
  }
  else{
  System.out.print("Maximum:"+b);
  }
 }
}