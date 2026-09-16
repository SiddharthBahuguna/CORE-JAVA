import java.util.*;
public class SpyNumber{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  int n=sc.nextInt();
  
  int sum=0, product=1;
  int temp=n;

  while(temp > 0){
  int digit = temp % 10;
  sum = sum + digit;
  product = product * digit;
  temp = temp/10;
  
}
  
if(sum == product){
  System.out.println("Spy Number");
 }
else{
 System.out.println("Not a Spy Number");
 }
}
}