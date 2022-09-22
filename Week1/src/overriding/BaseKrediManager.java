package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {  //diger sınıflar tarafından ezilebilir."final olmadıgı için". 
		return tutar*1.14;
	}
	
	public final double hesapla2(double tutar) {   //final yazarsak, bu şu demek: BaseKrediManagerdaki hesapla2 methodu onu extend eden her sınıfta uygulanmak zorundadır,ezilebilir ve sen içeriğini o sınıfa göre değiştirebilirsin.
		return tutar*1.20;                         //extend edilen sınıflarda bu methodu yazdırmana izin vermez.
	}

}
