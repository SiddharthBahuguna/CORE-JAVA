import java.util.*;
public class HCFOfTwoNumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a:");
    int a=sc.nextInt();
    System.out.print("Enter b:");
    int b=sc.nextInt();
    
    while(b!=0){
    int ld = a % b;
    a = b;
    b = ld;
    }
    System.out.print("HCF:"+a);
   }
}