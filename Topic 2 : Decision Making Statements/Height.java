import java.util.*;
public class Height{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Height:");
  double height=sc.nextDouble();

  if(height >= 165.0 && height<=195.0){
  System.out.print("The person is Taller");
  }
  else if(height >=150.0 && height < 165){
  System.out.print("The person is average height");
  }
  else{
  System.out.print("The person is Dwarf");
  }
 }
}