import java.util.*;
public class SumOfNaturalNumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int sum=0;
    int counter=1;

    while(n >= counter){
    sum = sum + counter;
    counter++;
   }
   System.out.print(sum);
  }
} 