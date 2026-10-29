import java.util.*;
public class FindAllFactorsOfANumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int n=sc.nextInt();
   
    int i=1;
    while(n >= i){
    if(n%i==0){
    System.out.print(i+" ");
    }
    i++;
  }
 }
}