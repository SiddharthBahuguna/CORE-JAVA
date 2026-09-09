import java.util.*;
public class FirstLastDigit{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter 3 digit number:");
  int n=sc.nextInt();
  
  int firstDigit = n / 100;
  int lastDigit = n % 10;

  System.out.print("Last Digit:"+lastDigit +"\n" + "First Digit:"+firstDigit);
  }
}
  