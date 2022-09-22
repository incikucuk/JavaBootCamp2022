package interfaceDemo;

public class MyWorker implements IPayable,IEatable,IWorkable{   //Coklu implementasyon

	@Override
	public void work() {
		System.out.println("Workers work!");
		
	}

	@Override
	public void eat() {
		System.out.println("Workers eat!");
		
	}

	@Override
	public void pay() {
		System.out.println("Workers take a pay!");
		
	}

}
