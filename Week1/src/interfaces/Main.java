package interfaces;

public class Main {
  
	public static void main(String[] args) {
		
		//interfaceler class kabul edilmiyor.Ama normal class ve abstract classlar gibi referans tutabiliyorlar.
        //classların yapısı; tum yapilarin tamalanmais olmasi gerekiyordu.
		//abtractlarda; kimisi dolu kimisi boş olabilirdi.Onu inherit eden içini doldurmak zorundaydı.
		//interfacelerde ise; tamamlanmamış operasyonlar içerir.Intergaceler implementasyon kabul ediliyor,inheritance kabul edilmiyor.Bir class birden fazla interfaceyi implementasyon edebiliyor.
		
		
		//Bır class birden fazla ınterface i implemete edebilir, ancak 1 tane abstract class extend edebilir.
		//INTERFACELER DE ABSTRACT CLASSLAR GİBİ NEW'LENEMEZ..
		
		ICustomerDal customerDal = new OracleCustomerDal();  //referans tutucu
		customerDal.Add();
		
		//CustomerManager customerManager = new CustomerManager();
		//customerManager.customerDal = new MySqlCustomerDal();
		//customerManager.Add();
		
		//daha iyi kod
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.Add();
		
	}

}
