import java.util.*;
public class VehicleManufacturing{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter total number of Vehicles:");
   int vehicle=sc.nextInt();

   System.out.print("Total number of Wheels:");
   int wheels=sc.nextInt();
   
   int fourWheeler=(wheels-2*vehicle)/2;
   int twoWheeler=vehicle-fourWheeler;
   
   System.out.println("TW:"+twoWheeler);
   System.out.println("FW:"+fourWheeler);
   }
}

   