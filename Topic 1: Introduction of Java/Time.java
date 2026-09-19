import java.util.*;
public class Time{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter seconds:");
  int totalSec=sc.nextInt();
  
  int hours = totalSec/3600;    // calculate hours
  int remSec = totalSec % 3600; // find remaining seconds after extracting hours
  int min = remSec /60;         // calculate minutes from the remaining seconds
  int sec = remSec % 60;        // find the final remaining seconds

  System.out.println("Hours:" +hours);
  System.out.println("Minutes:" +min);
  System.out.println("Seconds:" +sec);
  }
}