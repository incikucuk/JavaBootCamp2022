package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		//inner class and static
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name="laptop";
		product.price=10000;
		manager.add(product);
		
		//inner class
		DatabaseHelper.Connection.createConnection();

	}

}
