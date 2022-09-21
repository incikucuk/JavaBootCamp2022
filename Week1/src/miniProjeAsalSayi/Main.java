package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 7;
		int remainder = number % 2;
		boolean isPrime= true;
		
		for(int i=2;i<number;i++) {
			if(number %i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayi asaldir");
		}else {
			System.out.println("Sayi asal degildir");
		}
		

	}

}
