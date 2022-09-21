package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,5,8,9,4};
		int aranacak = 1;
		boolean varMi = false;
		
		for(int sayi: sayilar) {
			if(aranacak == sayi){
				varMi = true;
				break;
			}
		}
		String mesaj ="";
		
		if(varMi) {
			mesaj ="var";
			mesajVer(mesaj);
		}else {
			System.out.println("yok");
			
		}

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
