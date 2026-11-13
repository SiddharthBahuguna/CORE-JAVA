import java.util.*;
public class ProductOfDigitsOfNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int prod=1;
    while(n!=0){
    int ld=n%10;
    prod = prod*ld;
    n=n/10;
    }
    System.out.print(prod);
   }
}