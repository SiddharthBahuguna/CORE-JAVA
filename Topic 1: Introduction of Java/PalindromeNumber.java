import java.util.*;
public class PalindromeNumber{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  int n=sc.nextInt();
  
  int org = n;
  int rev = 0;
  while(n > 0){
  int digit = n % 10;
  rev = rev*10 +digit;
  n = n/10;
}
 
 if(org == rev){
  System.out.print("Palindrome");
 }
 else{
System.out.println("Not Palindrome");
  }
 } 
}