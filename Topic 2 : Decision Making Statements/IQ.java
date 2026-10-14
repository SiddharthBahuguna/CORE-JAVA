import java.util.*;
public class IQ{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter current IQ of person:");
    int iq=sc.nextInt();
    
    if(iq+7 >=170){
    System.out.print("Yes");
    }
    else{
    System.out.print("No");
   }
  }
 }