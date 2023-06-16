
import java.util.HashMap;
import java.util.List;

public abstract class ServiseStation {

	
	private CarType car;
	
	private List<ServiceType> allservice;
	

	
	public void setCarType(CarType car) {
		
		this.car=car;
	}
	
	
	public CarType getcarType() {
		
		return car;
	}
	
	
	public void setallServices(List<ServiceType> allservice) {
		
		this.allservice=allservice;
		
	}
	public List<ServiceType> getAllService(){
		
		return allservice;
	}
	
	
	
	
	public abstract HashMap<String,Integer> billing(CarType car,List<ServiceType>allservice);
		
	

			
				
				
				
			
			
			
			
			
			
		
		
		
	}
	
		
	
	
	
	
	
	

