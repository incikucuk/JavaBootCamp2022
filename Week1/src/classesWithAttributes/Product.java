package classesWithAttributes;

public class Product {
	
	public Product(int id,String name,String description,double price,int stockAmount,String color) {
		System.out.println("Constructor started");
		this._id = id;
		this._name = name;
		this._description =description;
		this._price = price;
		this._stockAmount = stockAmount;
		this._color = color;
		
		
	}
	public Product() {
		
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _productCode;
	
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String _name) {
		this._name = _name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String _description) {
		this._description = _description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double _price) {
		this._price = _price;
	}
	public int getStockAmount() {
		return _stockAmount;
	}
	private void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	private String getColor() {
		return _color;
	}
	private void setColor(String _color) {
		this._color = _color;
	}
	private String getProductCode() {
		return _productCode;
	}
	private void setProductCode(String _productCode) {
		this._productCode = _productCode;
	}
}
