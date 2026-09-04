import java.util.*;
public class CheckEquality{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter A:");
  int a=sc.nextInt();

  System.out.print("Enter B:");
  int b=sc.nextInt();
  
  if(a==b){
  System.out.print("Equal");
  }
  else{
  System.out.print("Not Equal");
  }
 }
}