import java.util.*;
public class SeasonDisplay{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Number(1-4):");
     int n=sc.nextInt();
     
     switch(n){
         case 1:
              System.out.print("Spring");
              break;
          case 2:
               System.out.print("Summer");
               break;
          case 3:
               System.out.print("Autumn");
               break;
           case 4:
                System.out.print("Winter");
                break;
           default:
                 System.out.print("Invalid value");
               }
         }
}