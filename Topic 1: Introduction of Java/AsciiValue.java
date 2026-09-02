import java.util.*;
public class AsciiValue{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Character:");
  char character=sc.next().charAt(0);
  int asciiValue=(int) character;

  System.out.print("ASCII Value:"+asciiValue);
  }
}