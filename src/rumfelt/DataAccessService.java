package rumfelt;

import java.util.ArrayList;
import java.util.List;

public class DataAccessService {



	
	public List<Person> manualPersonalEntry() {
		
		List<Person> personal = new ArrayList<>();
		
		personal.add(new Person("Kasey ","Loan Officer ", 4664356 ,"Drawing",30, "Married", 5, null));
		personal.add(new Person("Connor "," Student ", 4391173 ,"Singing",6, "Single", 3, null));
		personal.add(new Person("Savannah "," Child ", 2371236 ,"Eating",3, "Single", 4, null));
		return personal;
	}
	

	
	public List<BusinessContact> manualBusinessEntry() {
		
		List<BusinessContact> business = new ArrayList<>();
		
		business.add(new BusinessContact("Best Buy", "Electronics ", 8529916, 8-22, "www.bestbuy.com", 35, null));
		business.add(new BusinessContact("Publix", "Groceries", 8572937, 7-20, "www.publix.com", 23, null));
		business.add(new BusinessContact("Hobby Lobby", "Home Decor and Hobby ", 86488725, 10-19, "www.hobbylobby.com", 44, null));
	
		return business;
		
	}

	
	
}
