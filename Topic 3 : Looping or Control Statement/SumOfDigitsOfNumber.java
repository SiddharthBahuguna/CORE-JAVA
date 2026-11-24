import java.util.*;
public class SumOfDigitsOfNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    int sum=0;

    while(n!=0){
    int ld = n%10;
    sum = sum+ld;
    n = n/10;
   }
   System.out.print(sum);
  }
}
    