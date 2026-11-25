import java.util.*;
public class SumOfOddNumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    
    int sum=0;
    while(n >=0){
    if(n%2 !=0){
    sum = sum + n;
    }
    n--;
   }
   System.out.print(sum);
  }
}