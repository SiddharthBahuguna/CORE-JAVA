import java.util.*;
public class LibraryFineCalculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of days late:");
    int n=sc.nextInt();
    
    int fine=0; 
    String status="Active";

    if(n <=5){
      fine = n*2;
     }
    else if(n>=6 && n<=10){
      fine = n*3;
     }
     else if(n>=11 && n<=30){
      fine = n*5;
     }
     else{
       fine = 500;
       status = "Cancelled";
      }
     System.out.println("Total fine=" +fine);
     System.out.println("Membership Status=" + status);
   }
}