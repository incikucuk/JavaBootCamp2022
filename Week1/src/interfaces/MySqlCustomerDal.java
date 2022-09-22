package interfaces;

public class MySqlCustomerDal implements ICustomerDal {  //bunu implemete eden herkes bu operasyonları icermek zorunda

	@Override
	public void Add() {
		System.out.println("Mysql added!");
		
	}
	
}
