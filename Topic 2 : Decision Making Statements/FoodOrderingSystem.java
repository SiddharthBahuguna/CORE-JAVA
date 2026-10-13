import java.util.*;
public class FoodOrderingSystem{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your choice: 1:Burger 2:Pizza 3:Pasta 4:Sandwich");
      int n=sc.nextInt();
      switch(n){
        case 1:
             System.out.print("Burger-?120");
             break;
        case 2:
             System.out.print("Pizza-?150");
             break;
        case 3:
             System.out.print("Pasta-?100");
             break;
        case 4:
             System.out.print("Sandwich-?80");
             break;
        default:
             System.out.print("Invalid Selection");
             break;
           }
     }
}