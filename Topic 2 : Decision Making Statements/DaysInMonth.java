import java.util.*;
public class DaysInMonth{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Month(1-12):");
   int month=sc.nextInt();
    
   if(month==2){
    System.out.print("28 or 29 days");
    }
    
   else if(month==4 || month==6 || month==9 || month==11){
   System.out.print("31 Days");
   }
   else{
   System.out.print("Invalid Month");
   }
  }
}
   