import java.util.*;
public class BankingMenu{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double balance = 5000;

    System.out.println("-----------------Banking Menu---------------------");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");
  
    int choice=sc.nextInt();
    switch(choice){
        case 1: 
             System.out.println("Enter amount to be deposit:");
             double deposit = sc.nextDouble();
             balance = balance+deposit;
             System.out.println("Deposit Successful");
             System.out.printf("Current Balance: %.2f\n",balance);
             break;
       case 2:
            System.out.println("Enter amount needed to withdraw:");
            double withdraw=sc.nextDouble();
            
            if(balance >= withdraw){
            balance = balance-withdraw;
            System.out.println("Withdraw Successful");
            System.out.println("Current Balance:"+balance);
            }
            else {
            System.out.print("Insufficient Amount");
            }
            break;
      case 3: 
           System.out.printf("Current Balance:%.2f",balance);
           break;
      case 4:
           System.out.println("Thank You for banking with us");
           break;
      default:
           System.out.println("Invalid Choice");
         }
    }
}
