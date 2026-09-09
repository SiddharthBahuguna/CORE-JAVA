import java.util.*;
public class LargerDigit{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number:");
  int n=sc.nextInt();

  int firstDigit=n/100;
  int lastDigit=n%10;
  
  if(firstDigit > lastDigit){
  System.out.print("Larger Digit:"+firstDigit);
  }
  
  else{
   System.out.print("Larger Digit:"+lastDigit);
  }
 }
}