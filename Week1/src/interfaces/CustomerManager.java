package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;  //polymorphism
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void Add() {
		//is kodları
		this.customerDal.Add();
		
	}
}
