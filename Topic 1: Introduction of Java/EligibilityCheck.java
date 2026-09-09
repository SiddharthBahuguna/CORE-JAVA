import java.util.*;
public class EligibilityCheck{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter percentage:");
  int percentage=sc.nextInt();

  System.out.print("Enter income:");
  int income=sc.nextInt();
  
  if(percentage>=75 && income < 200000){
  System.out.print("Eligible");
  }
  else{
  System.out.print("Not Eligible");
  }
 }
}