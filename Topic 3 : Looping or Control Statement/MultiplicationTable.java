import java.util.*;
public class MultiplicationTable{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    
    int i=1;
    while(i<=10){
    System.out.printf("%d X %d = %d\n",n,i,n*i);
    i++;
    }
  }
}