package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		_customerCheckService=customerCheckService;
	}

	public void  Save(Customer customer)
	{
		if(_customerCheckService.CheckIfRealPerson(customer))
		{
			super.Save(customer);
			System.out.println("Saved to db "+customer.getFirstName());
		}else {
			System.out.println("Not a valid person.");
		}
		
	}
	
}
