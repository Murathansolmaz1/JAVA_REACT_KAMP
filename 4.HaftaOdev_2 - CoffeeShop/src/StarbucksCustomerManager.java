
public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService{
	
	public CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customercheckService) {
		_customerCheckService = customercheckService;
	}
	 
@Override
public void Save(Customer customer) {
	
	
	if(_customerCheckService.CheckIfRealPerson(customer)) {
		super.Save(customer);
	}
	else {
		System.out.println("Not a valid person");
	}
	
		
}
}
