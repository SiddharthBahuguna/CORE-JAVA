import java.util.*;
public class ATMWithdrawal{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter withdrawal amount:");
  int withdrawal=sc.nextInt();
  
  System.out.print("Enter account balance:");
  double accBalance=sc.nextDouble();
  
  if(withdrawal%5==0 && accBalance >= (withdrawal+0.50)){
   accBalance=accBalance-(withdrawal+0.50);
  }
  System.out.printf("%.2f\n",accBalance);
 }
}