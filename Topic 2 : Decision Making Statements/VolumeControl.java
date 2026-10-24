import java.util.*;
public class VolumeControl{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    while(t-- > 0){
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    int diff=y-x;
    int presses = diff/11;
    if(diff % 11 !=0){
    presses++;
    }
    System.out.println(presses);
   }
  }
}