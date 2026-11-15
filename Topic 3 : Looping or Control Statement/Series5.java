import java.util.*;  //5 3 10 6 15 9 20 12 25 15 30 18 35 21 40
public class Series5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter N:");
    int n=sc.nextInt();
    
    for(int i=1; i <=n; i++){
    int firstTerm=5*i;
    int secondTerm=3*i;
    
    System.out.print(firstTerm+" "+secondTerm+" ");
    }
  }
}