package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		//abstract classlar newlenemez.
		//BaseGameCalculator baseGameCalculator = new WomanGameCalculator();
		//baseGameCalculator.hesapla();
		
		BaseGameCalculator baseGameCalculator = new OlderGameCalculator();
		baseGameCalculator.hesapla();
		

	}

}
