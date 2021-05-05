
public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.id= 1;
		customer1.firstName = "Murathan";
		customer1.lasName = "Solmaz";
		customer1.date = 1998;
		customer1.nationaltyId = 12345678912L;
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(customer1);
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.Save(customer1);
		
	}

}
