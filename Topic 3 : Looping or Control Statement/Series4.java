import java.util.*; //1 2 4 7 11 16 22 29 37 46
public class Series4{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter N:");
     int n=sc.nextInt();
     int firstTerm=1;
     int diff=1;
 
     for(int i=1;i<=n;i++){
     System.out.print(firstTerm+" ");

     firstTerm = firstTerm + diff;
     diff++;
     }
  }
}