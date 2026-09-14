import java.util.*;
public class QuotientRemainder{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Dividend:");
  int divident=sc.nextInt();
  System.out.print("Enter Divisor:");
  int divisor=sc.nextInt();
  
  int rem=divident%divisor;
  int q=divident/divisor;
  
  System.out.println("Remainder:"+rem);
  System.out.println("Quotient:"+q);
 }
}