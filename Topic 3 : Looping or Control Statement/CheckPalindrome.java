import java.util.*;
public class CheckPalindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    int temp=n;
    int rev=0;

    while(n!=0){
    int ld=n%10;
    rev = rev*10+ld;
    n=n/10;
   }
   if(rev==temp){
   System.out.print("Palindrome number");
   }
   else{
   System.out.print("Not Palindrome");
   }
 }
}