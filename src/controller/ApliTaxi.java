package controller;

import java.util.Scanner;

public class ApliTaxi {
	
	int base_distance;
	int base_price;
	int above_base_distance;
	int milestone_distnace;
	
	public void  mini() {
		int base_distance=3;
		int base_price= 50;
		int above_base_distance =10;
		int milestone_distnace =75;
		
    }
	
	public void sedan() {
		int base_distance=5;
		int base_price=80;
		int above_base_distance=12;
		int milestone_distnace=100;
	}
	
	public void SUV() {
		int base_distance=5;
		int base_price=100;
		int above_base_distance=15;
		int milestone_distnace=0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApliTaxi apli=new ApliTaxi();
       int type_of_car;
       int distane_travelled;
       
       Scanner sc = new Scanner(System.in);
//       type_of_car=sc.nextInt();
//       distane_travelled=sc.nextInt();
       System.out.println("Enter the type of car :");
       int choice=sc.nextInt();
       
       int option=0;
       switch(option) {
       case 1:
    	   System.out.println("Enter distance travelled :");
           int distance_trl=sc.nextInt();
    	   apli.mini();
    	   break;
       case 2:
    	   System.out.println("Enter distance travelled :");
           int distance_trl1=sc.nextInt();
    	   apli.sedan();
    	   break;
       case 3:
    	   System.out.println("Enter distance travelled :");
           int distance_trl2=sc.nextInt();
    	   apli.SUV();
        break;
       default:
    		   System.out.println("Please enter a valid choice");
       
       }
       
	}

}
