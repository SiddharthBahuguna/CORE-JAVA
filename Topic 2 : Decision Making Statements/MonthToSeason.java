import java.util.*;
public class MonthToSeason{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Month Number=");
    int month=sc.nextInt();
    String season;

    if(month>=1 && month<=12){
      if(month==12 || month==1 || month==2){
      season = "Winter";
      }
      else if(month>=3 && month<=5){
      season = "Spring";
      }
      else if(month>=6 && month<=8){
      season ="Summer";
      }
      else{
      season = "Autumn";
      }
     System.out.print("Season:"+season);
    }
    
    else{
     System.out.print("Invalid month number");
    }
 }   
}