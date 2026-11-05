import java.util.*;
public class PrintAllASCIIWithNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int i=0; 
    while(i<=127){
    char asciiValue=(char)(i);
    System.out.println(i+"="+asciiValue);
    i++;
   }
}
}
 