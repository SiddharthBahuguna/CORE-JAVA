import java.util.*;
public class ThirdAngle{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Angle1:");
  int a1=sc.nextInt();
  System.out.print("Enter Angle2:");
  int a2=sc.nextInt();

  int a3=180-(a1+a2);
  
  System.out.println("Third Angle="+a3);
  }
}