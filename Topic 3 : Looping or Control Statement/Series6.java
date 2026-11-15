import java.util.*; //7 10 15 22 31 42 55 70
public class Series6{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int term=7;
    int diff=3;

    for(int i=1;i<=n;i++){
    System.out.print(term+" ");
    term=term+diff;
    diff=diff+2;

   }
 }
}