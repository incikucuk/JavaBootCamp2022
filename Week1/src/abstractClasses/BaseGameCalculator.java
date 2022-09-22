package abstractClasses;

public abstract class BaseGameCalculator {  //abtarct class da tamamlanmış ve tamamlamamaış operasyonlar bulunur.abstract method bulunması zorunlu degildir.
	
	public abstract void hesapla();  //bu sınıfı inhert eden her sınıfta bu method olması zorunludur.Her class kendi hesaplasını yazmak zorundadır. 
	
	public void gameOver() {
		System.out.println("Oyun bitti");
		
	}
	
	public final void gameStart() {  //override edilmesini istemedin fianl yazdım
		System.out.println("Oyun baslatildi..");
	}
}
