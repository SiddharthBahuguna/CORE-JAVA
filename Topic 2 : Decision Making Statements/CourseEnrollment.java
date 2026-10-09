import java.util.*;
public class CourseEnrollment{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter total testcases:"); 
    int t=sc.nextInt();
    
    while(t-- >0){
    System.out.print("Enter value of friends who wish to enroll in course(NN):");
     int nn=sc.nextInt();
      
     System.out.print("Enter the value of maximum students limit in course(MM):");
      int mm=sc.nextInt();
      
     System.out.print("Enter the number of students who have already enrolled(KK):");
      int kk=sc.nextInt();
      
      int ans=mm-kk;

      if(ans >= nn){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
    }
  }
 }
     