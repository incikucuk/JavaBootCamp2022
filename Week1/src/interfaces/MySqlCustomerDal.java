package interfaces;

public class MySqlCustomerDal implements ICustomerDal {  //bunu implemete eden herkes bu operasyonlarÄ± icermek zorunda

	@Override
	public void Add() {
		System.out.println("Mysql added!");
		
	}
	
}
