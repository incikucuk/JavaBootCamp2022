package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 220;
		int number2 = 284;
		int total1 =0;
		int total2 = 0;
		
		for(int i=1;i<220;i++) {
			if(number1 % i == 0) {
				total1 += i;
			}
		}
		for(int k=1;k<284;k++) {
			if(number2 % k == 0) {
				total2 += k;
			}
		}
		
		if(total1 == number2 && total2 == number1) {
			System.out.println("Arkadas sayi");
		}else {
			System.out.println("degildir");
		}
		

	}

}
