
public abstract class BaseCustomerManager implements CustomerService{
	
	public CustomerCheckService _customerCheckService;
	
	public BaseCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.firstName);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
	}
	
	@Override
	public void Delete(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Deleted to db : " + customer.firstName);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
	}
	
	@Override
	public void Update(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Customer updated from db : " + customer.firstName);
		}
		else {
			System.out.println("Not a valid person");
		}
		
		
	}
}
