import java.util.*;
public class MonthDays{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter month(1-12):");
    int month=sc.nextInt();
    System.out.print("Enter year:");
    int year=sc.nextInt();
    
    int days;
    
    switch(month){
      case 1:  //Jan
      case 3:  //March
      case 5:  //May
      case 7:  //July
      case 8:  //Aug
      case 10: //Oct
      case 12: //Dec
           days=31;
           break;
      case 4:  //April
      case 6:  //June
      case 9:  //Sept
      case 11: //Nov
           days=30;
           break;
      case 2:
           if((year%4==0 && year%100!=0) || (year%400 ==0)){
           days=29;
           }
           else{
           days=28;
           }
           break;
       default:
           System.out.println("Invalid month");
           return;
         }
       System.out.println("Number of days="+days);
       }
}