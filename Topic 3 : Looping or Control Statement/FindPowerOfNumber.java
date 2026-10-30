import java.util.*;
public class FindPowerOfNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Base:");
    int base=sc.nextInt();
    System.out.print("Enter Exponent:");
    int expo=sc.nextInt();
     
    int result=1,i=1;
    
    while(i <= expo){
     result = result*base;
     i++;
    }
    System.out.print(result);
  }
}