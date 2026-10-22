import java.util.*;
public class SalaryHike{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Basic Salary:");
    double salary=sc.nextInt();
    
    System.out.print("Enter years of service:");
    int service=sc.nextInt();
    
    System.out.print("Enter performance rating:");
    int rating=sc.nextInt();
    double hike;
    
    if(rating>=4 && service > 5){
    hike = salary*0.20;
    }
    else if(rating >=3){
    hike = salary*0.10;
    }
    else{
    hike = salary*0.05;
    }
    int newS=(int)(salary+hike);
    System.out.print("New Salary:"+newS);
   }
 }