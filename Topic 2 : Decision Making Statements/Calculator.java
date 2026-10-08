import java.util.*;
public class Calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter num1:");
    int num1=sc.nextInt();
    System.out.print("Enter num2:");
    int num2=sc.nextInt();
    
    System.out.print("Enter operator:");
    char op=sc.next().charAt(0);
   
    int result;

    switch(op){
        case '+':
              result = num1+num2;
              break;
        case '-':
              result = num1-num2;
        case '*':
               result = num1*num2;
        case '/':
             if(num2 !=0){
                result = num1/num2;
               }
             else{
                System.out.print("Error: Division by zero");
                return;
               }
               break;
        case '%':
              result = num1 % num2;
              break;
        default:
              System.out.print("Error: Invalid operator");
              return;
        }
        System.out.print("Result:" + result);
     }
}