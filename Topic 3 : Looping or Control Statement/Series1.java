import java.util.*;    //1 2 2 4 3 6 4 8 5 10 6 12
public class Series1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
    int firstN=i;
    int secondN=2*i;
    
    System.out.print(firstN+" ");
    System.out.print(secondN+" ");
    }
  }
}