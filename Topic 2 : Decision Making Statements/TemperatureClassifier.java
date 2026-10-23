public class TemperatureClassifier{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter temperature is Celsius:");
    int temp=sc.nextInt();
    
    if(temp < 0){
    System.out.print("Freezing");
    }
    else if(temp>=0 && temp<=20){
    System.out.print("Cold");
    }
    else if(temp>=21 && temp<=35){
    System.out.print("Warm");
    }
    else{
    System.out.print("Hot");
   }
  }
 }