import java.util.*;
public class PrintNthArmstrongNumber{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Nth Value for Armstrong Number:");
    int n=sc.nextInt();
     
    int count=0;
    int num=0;
    
    while(n > count){
    int temp=num;
    int digits=0;
    
    // count total digits for the current number
    if(temp==0){
    digits=1;
    }
    else{
    while(temp!=0){
    temp=temp/10;
    digits++;
     } 
    }
    temp = num;
    int sum = 0;

    // calculate the sum of digits raised to the power of digits
    while(temp!=0){
    int ld=temp%10;
    sum = (int)(sum + Math.pow(ld,digits));
    temp = temp/10;
    }
    if(sum==num){
    System.out.print(num+" ");
    count++;  // only increment if a valid Armstrong number is found
    }
    num++;
  }
 }
}