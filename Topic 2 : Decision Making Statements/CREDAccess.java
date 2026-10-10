import java.util.*;
public class CREDAccess{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter credit score:");
    int x=sc.nextInt();
     
    if(x>=750){
    System.out.print("YES");
    }
    else{
    System.out.print("NO");
    }
  }
}