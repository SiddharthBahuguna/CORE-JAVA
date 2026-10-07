import java.util.*;
public class ATMWithdrawal{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter amount which needed to be withdraw:");
    int withdraw=sc.nextInt(); 

    System.out.print("Enter the total amount present in bank:");
    double total=sc.nextDouble();
    
    if(withdraw%5==0 && total>=withdraw+0.50){
    total = total-(withdraw+0.50);
    }
    System.out.printf("%.2f\n",total);
   }
}