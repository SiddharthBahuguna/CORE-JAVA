import java.util.*;
public class LargestAndSmallestNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int temp=n;
    int max=0, min=9;
    
    while(temp!=0){
    int ld = temp % 10;

    if(ld > max){
    max = ld;
    }

    if(ld < min){
    min = ld;
    }
    
    temp = temp/10;
   }
   System.out.println("Largest Digit:"+max);
   System.out.println("Smallest Digit:"+min);
  }
}