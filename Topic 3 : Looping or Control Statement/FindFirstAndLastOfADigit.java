import java.util.*;
public class FindFirstAndLastOfADigit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
    
    int ld=n%10; //ld

    while(n >= 10){
    n=n/10;
    }
    
    int fd=n;
    System.out.println("First Digit:"+fd);
    System.out.println("Last Digit:"+ld);
   }
}