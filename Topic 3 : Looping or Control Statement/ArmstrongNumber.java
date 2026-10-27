import java.util.*;
public class ArmstrongNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    int count=0;
    
    while(n!=0){
    ++count;
    n=n/10;
    }
    
    n=temp;    

    while(n !=0){
    int ld=n%10;
    sum = (int)(sum + Math.pow(ld,count));
    n=n/10;
    }
    if(sum==temp){
    System.out.print("Armstrong Number");
    }
    else{
    System.out.print("Not Armstrong");
    }
   }
}