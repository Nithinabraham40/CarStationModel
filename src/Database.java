import java.util.HashMap;

public class Database {

	
	
	
	
	
public HashMap<ServiceType,Integer>SedanDatabase(){
		
		HashMap<ServiceType,Integer>map=new HashMap<>();
		
		map.put(ServiceType.BS01,4000);
		map.put(ServiceType.BF01, 1500);
		map.put(ServiceType.CF01, 4000);
		map.put(ServiceType.EF01, 8000);
		map.put(ServiceType.GF01, 6000);
		
		return map;
		
	}
	
	public HashMap<ServiceType,Integer>hatchbackDatabase(){
		
		HashMap<ServiceType,Integer>map=new HashMap<>();
		
		map.put(ServiceType.BS01,2000);
		map.put(ServiceType.BF01, 1000);
		map.put(ServiceType.CF01, 2000);
		map.put(ServiceType.EF01, 5000);
		map.put(ServiceType.GF01, 3000);
		
		return map;
		
	}
	
    public HashMap<ServiceType,Integer>suvDatabase(){
		
		HashMap<ServiceType,Integer>map=new HashMap<>();
		
		map.put(ServiceType.BS01,5000);
		map.put(ServiceType.BF01, 2500);
		map.put(ServiceType.CF01, 6000);
		map.put(ServiceType.EF01, 10000);
		map.put(ServiceType.GF01, 8000);
		
		return map;
		
	}
	
	
	
}
