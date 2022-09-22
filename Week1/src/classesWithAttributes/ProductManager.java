package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		System.out.println(product.getName()+" Added!");
	}
    public void Remove(Product product) {
    	System.out.println(product.getName()+" Removed!");
	}
    public void Update(Product product) {
    	System.out.println(product.getName()+" Updated!");
    }
    public void Add2(){
    	
    }
}
