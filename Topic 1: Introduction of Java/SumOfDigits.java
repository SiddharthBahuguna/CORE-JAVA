import java.util.*;
public class SumOfDigits{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);

  System.out.print("Enter number:");
  int num =sc.nextInt();
  int sum=0;

  
  while(num > 0){
  int lastDigit = num%10;
  sum = sum + lastDigit;
  num = num/10;
 }
  System.out.print("Sum:"+sum);
 }
}