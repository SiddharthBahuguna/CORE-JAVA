import java.util.*;
public class NumberToWord{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number(1-5):");
    int n=sc.nextInt();
     
    switch(n){
          case 1:
               System.out.print("One");
               break;
          case 2:
               System.out.print("Two");
               break;
          case 3:
               System.out.print("Three");
               break;
          case 4:
               System.out.print("Four");
               break;
          case 5:
               System.out.print("Five");
               break;
          default:
               System.out.print("Invalid Number");
             }
       }
}