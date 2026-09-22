import java.util.*;
public class VolumeControl{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter initial volume:");
  int x=sc.nextInt();

  System.out.print("Enter final volume:");
  int y=sc.nextInt();
  
  int ans=Math.abs(x-y);
  
  System.out.print("Output:"+ans);
 }
}