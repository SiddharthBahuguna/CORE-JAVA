import java.util.*;
public class StrongNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int temp=n, sum=0;
    
    while(n!=0){
    int ld = n % 10;
    
    int fact = 1;
    int i = 1;
    
    while(i <= ld){
    fact = fact*i;
    i++;
    }
    
    sum = sum + fact;
    n= n/10;
   }
   if(sum == temp){
   System.out.print("Strong Number");
   }
   else{
   System.out.print("Not a Strong Number");
   }
  }
}