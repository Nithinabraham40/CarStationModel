
import java.util.HashMap;
import java.util.List;

public class MyServiceStation extends ServiseStation{
	
	
	
	private Database db;
	
	public MyServiceStation() {
		db=new Database();
	}
	
	
	
	@Override
	
	public  HashMap<String,Integer> billing(CarType car,List<ServiceType>allservice){
		
		
		if(car==CarType.Hatchback) {
			
			HashMap<String,Integer>hm=getOutputToPrint(db.hatchbackDatabase(),allservice);
		return hm;	
		}
		
		else if(car==CarType.SUV) {
			
			HashMap<String,Integer>hm=getOutputToPrint(db.suvDatabase(),allservice);
		return hm;	
		}
			
		
       else if(car==CarType.Sedan) {
			
			HashMap<String,Integer>hm=getOutputToPrint(db.SedanDatabase(),allservice);
		return hm;	
       }
		
		
		return null;	
			

	

}



	private HashMap<String, Integer> getOutputToPrint(HashMap<ServiceType, Integer> dataBase,
			List<ServiceType> allservice) {
		
		
		HashMap<String, Integer> ans=new HashMap<>();
		
		
		
		int amount=0;
		
		for(ServiceType services:allservice) {
		if(services==ServiceType.BS01) {
			amount=amount+dataBase.get(services);
			ans.put("Charges for Basic Servicing-Rs"+dataBase.get(services),amount);
			
			
		}
		else if(services==ServiceType.BF01) {
			amount=amount+dataBase.get(services);
			ans.put("Charges for Bake Fixing-Rs"+dataBase.get(services),amount);
			
		}
		
		else if(services==ServiceType.CF01) {
			amount=amount+dataBase.get(services);
			ans.put("Charges for Clutch Fixing-Rs"+dataBase.get(services),amount);
			
		}
		else   if(services==ServiceType.GF01) {
			amount=amount+dataBase.get(services);
				ans.put("Charges for Gear Fixing-Rs"+dataBase.get(services),amount);
				
			}
            
		else if(services==ServiceType.EF01) {
			amount=amount+dataBase.get(services);
				ans.put("Charges for Engine Fixing-Rs"+dataBase.get(services),amount);
				
			}

		




		
	}
		
	
		
		
		return ans;
		
	}
	




}
