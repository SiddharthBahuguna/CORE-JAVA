import java.util.*;
public class MenuDrivenProgram{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);

     System.out.println("1. Check whether a number is positive, negative, or zero");
     System.out.println("2. Check whether a number is even or odd");
     System.out.println("3. Find the maximum number between two numbers");

     System.out.println("Enter Choice");
     int choice = sc.nextInt();
     
     switch(choice){
              case 1:
                     System.out.print("Enter number:");
                     int n=sc.nextInt();
                     String ans=(n>0?"Positive Number":n<0?"Negative Number":"Zero");
                     System.out.print(ans);
                     break;
              case 2:
                     System.out.print("Enter number:");
                     int num=sc.nextInt();
                     String a=(num%2==0?"Even Number":"Odd Number");
                     System.out.print(a);
                     break;
              case 3:
                     System.out.print("Enter num1:");
                     int num1=sc.nextInt();
                     System.out.print("Enter num2:");
                     int num2=sc.nextInt();
                     
                     int aa=(num1>num2?num1:num2);
                     System.out.print(aa);
                     break;
                default:
                      System.out.print("Enter correct data");
                }
         }
}


     
     