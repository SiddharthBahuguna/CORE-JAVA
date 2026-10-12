import java.util.*;
public class EzioManipulation{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    while(t-->0){ 
    System.out.print("Enter x:");
    int x=sc.nextInt();
    System.out.print("Enter y:");
    int y=sc.nextInt();
    
    if(x >=y){
    System.out.println("YES");
    }
    else{
    System.out.println("NO");
    }
   }
 }
} 

