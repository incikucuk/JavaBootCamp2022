package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.firstName ="inci";
		customer.email="blbal@";
		
		Employee employee = new Employee();
		employee.firstName ="employee person";
		employee.salary=3000;
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
	}

}
