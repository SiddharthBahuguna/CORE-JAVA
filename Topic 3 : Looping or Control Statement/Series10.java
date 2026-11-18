import java.util.*; //3 6 12 24 48 96 192
public class Series10{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    int term=3;

    for(int i=1;i<=n;i++){
    System.out.print(term+" ");
    term = term*2;  

    }
   }
 }