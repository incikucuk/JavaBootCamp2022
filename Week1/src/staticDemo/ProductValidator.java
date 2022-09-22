package staticDemo;

public class ProductValidator {
	
	//bir metodu static yaptıgınızda class ismiyle direkt cagrılır(newlemene gerek yok kullanmak icin)
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
