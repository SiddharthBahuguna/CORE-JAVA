import java.util.*;
public class BasicDataTypes{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 int intVal;
 float floatVal;
 double doubleVal;
 char charVal;
 boolean booleanVal;

System.out.print("Enter an integer:");
intVal = sc.nextInt();

System.out.print("Enter a float:");
floatVal = sc.nextFloat();

System.out.print("Enter a double:");
doubleVal = sc.nextDouble();

System.out.print("Enter a character:");
charVal = sc.next().charAt(0);

System.out.print("Enter a Boolean:");
booleanVal = sc.nextBoolean();

System.out.println(intVal);
System.out.println(floatVal);
System.out.println(doubleVal);
System.out.println(charVal);
System.out.println(booleanVal);

 }
}