package interfaceDemo;

public class Main {

	public static void main(String[] args) {
		
		MyWorker workers = new MyWorker();
		workers.work();
		workers.eat();
		workers.pay();
		
		Robot robots = new Robot();
		robots.work();

	}

}
