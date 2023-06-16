import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to our car service station!\r\n"
				+ "We're here to provide top-notch care for your vehicle  ");
		
		System.out.println("You need to select your Vehicle Type first");
			
			System.out.println("select "+1+" for HatchBack");
			System.out.println("select "+2+" for Sedan");
			System.out.println("select "+3+" for SUV");
			boolean choice=false;
			int selection=0;
			
			while(choice==false) {
				
			System.out.println("Enter your choice");
			 selection=sc.nextInt();
			
			
			if(selection>3||selection<=0) {
				System.out.println("select valid choice");
			}
			else {
				
				choice=true;
			}
			
			
			}
			
			System.out.println("Service available");
			System.out.println("Select "+1+" for BasicService");
			System.out.println("Select "+2+" for Engine Fixing");
			System.out.println("Select "+3+" for Cluch Fixing");
			System.out.println("Select "+4+" for Brake Fixing");
			System.out.println("Select "+5+" for Gear Fixing");
			System.out.println("Select "+0+" for exit");
			
			ArrayList<Integer>ls=new ArrayList<>();
			System.out.println("Enter your choices");
			while(sc.hasNext()) {
				
				int serviceChoice=sc.nextInt();
				if(serviceChoice==0) {
					break;
				}
				if(serviceChoice>5||serviceChoice<0) {
					System.out.println("Enter valid choice");
				}
				else {
					
					ls.add(serviceChoice);
					if(ls.size()>=5) {
						break;
					}
					
				}
				
				
			}
			
			
			 HashMap<String,Integer>map=getResult(selection,ls);
			 int total=0;
			 
			 for(String str:map.keySet()) {
				 
				 int amount=map.get(str);
				 if(amount>total) {
					 total=amount;
				 }
				 System.out.println(str);
				 
			 }
			 
			 if(total>=10000) {
				 
				 System.out.println("Total Bill-"+total);
				 System.out.println("Complementary cleaning serivice is also provided");
				 return;
			 }
			 
			 System.out.print("Total Bill-"+total);
			
			
		
		
		

	}

	private static HashMap<String, Integer> getResult(int selection, ArrayList<Integer> ls) {
		
		CarType car;
		
		List<ServiceType>serviseList=new ArrayList<>();
		
		if(selection==1) {
			
			car=CarType.Hatchback;
		}
		else if(selection==2) {
			car=CarType.Sedan;
		}
		else {
			car=CarType.SUV;
		}
		
		for(int number:ls) {
			
			if(number==1) {
				serviseList.add(ServiceType.BS01);
			}
			else if(number==2) {
				serviseList.add(ServiceType.EF01);
			}
			else if(number==3) {
				serviseList.add(ServiceType.CF01);
			}
			else if(number==4) {
				serviseList.add(ServiceType.BF01);
			}
			else {
				serviseList.add(ServiceType.GF01);
			}
		}
		
		MyServiceStation myStation=new MyServiceStation();
		
		HashMap<String,Integer>ans=myStation.billing(car, serviseList);
		
		
		return ans;
	}

}
