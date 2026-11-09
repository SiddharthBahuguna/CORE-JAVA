import java.util.*;
public class PrintNthPerfectNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Nth Perfect Number Value:");
    int n=sc.nextInt();
    int count=0;
    int num=2;
 
    while(n > count){
    int sum = 0;
    int i=1;

    while(i < num){
    if(num % i == 0){
    sum = sum + i;
    }
    i++;
    }
      
    if(sum==num){ 
    System.out.print(num+" ");
    count++;
    }
    
    num++;
   }
  }
} 