package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1,"phone33","bad",9000,2000,"black");
		//product.setName("ipek");
		//product.setId(3);
		//product.setDescription("nice");
		//product.setPrice(3000);
		
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		
		
		
		ProductManager manager =new ProductManager();
		manager.Add(product);
		manager.Remove(product);
	    manager.Update(product);

	}

}
