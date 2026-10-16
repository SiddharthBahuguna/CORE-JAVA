import java.util.*;
public class Monkeys{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);

   System.out.print("Total number of monkeys:");
   int n=sc.nextInt();
   
   System.out.print("Number of bananas eaten by one monkey:");
   int k=sc.nextInt();
   
   System.out.print("Number of peanuts eaten by one monkey:");
   int j=sc.nextInt();

   System.out.print("Total number of bananas:");
   int m=sc.nextInt();
   
   System.out.print("Total number of peanuts:");
   int p=sc.nextInt();
   
   //calculate monkeys who can eat bananas completely
   int bananaMonkeys = m/k;
   
   //if some bananas are left(less than k), one more monkey comes and eat remaining bananas
   if(m % k!=0) bananaMonkeys++;

   //calculate monkeys who can eat peanuts completely
   int peanutMonkeys = p/j;
   
   //if some peanuts are left(less than j), one more monkey comes and eats the remaining peanuts
   if(p % j!=0) peanutMonkeys++;

  // total monkeys that came down from tree
  int totalMonkeysFed = bananaMonkeys + peanutMonkeys;

  // remaining monkeys on tree
  int monkeysLeft = n -  totalMonkeysFed;

  //if food is more than the number of monkeys, or it is -ve which is not possible
  if(monkeysLeft < 0)
   monkeysLeft=0;
  
  System.out.print("Number of monkeys left on the tree:"+monkeysLeft);
 }
}