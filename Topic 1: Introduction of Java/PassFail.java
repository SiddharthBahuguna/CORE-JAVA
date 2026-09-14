import java.util.*;
public class PassFail{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter marks:");
  int marks=sc.nextInt();
  
  if(marks >=40){
  System.out.print("Pass");
  }
  else{
  System.out.print("Fail");
  }
 }
}