import java.util.*;
public class PrintNthStrongNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Nth Number:");
    int n=sc.nextInt();
    
    int count=0;
    int num=1;
    
    while(count < n){
    int temp = num;
    int sum = 0;
    
    while(temp!=0){
    int ld= temp%10;
    int fact = 1;
    int i=1;
    
    while(i <= ld){
    fact = fact*i;
    i++;
    }
    
    sum = sum + fact;
    temp = temp/10;
    }
   
    if(sum==num){
    System.out.print(num+" ");
    count++;
    }
    num++;
   }
 }
}