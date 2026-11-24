import java.util.*;
public class SpyNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int temp=n;
    int sum=0,prod=1;
    while(temp > 0){
    int ld = temp%10;
    sum = sum+ld;
    prod = prod*ld;
    temp=temp/10;
    }
    if(sum==prod){
    System.out.print("Spy Number");
    }
    else{
    System.out.print("Not Spy Number");
    }
  }
}