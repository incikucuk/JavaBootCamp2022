package method2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "inci kucuk";
		int sayi= Topla(5,7);
		System.out.println(sayi);
		ekle(mesaj);
		int toplam = addArray(1,2,3,4,7,8);
		System.out.println("toplam: "+ toplam);
		
	}
	
	public static void ekle(String message) {
		System.out.println("eklendi."+message);
	}
	
    public static void sil(String message) {
    	System.out.println("silindi."+message);
	}

    public static void guncelle(String message) {
    	System.out.println("guncellendi."+message);
    }
    public static int Topla(int n1,int n2) {
    	int toplam=0;
    	toplam= n1+n2;
    	return toplam;
    }
    
    public static int addArray(int... sayilar) {  //array ekleme
    	int toplam=0;
    	for(int sayi:sayilar) {
    		toplam +=sayi;
    	
    	}
		return toplam;
    }
    
}
