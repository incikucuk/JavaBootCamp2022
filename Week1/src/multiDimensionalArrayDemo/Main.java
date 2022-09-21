package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]sehirler = new String[3][3];
		
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "bursa";
		sehirler[0][2] = "kocaeli";
		sehirler[1][0] = "ısparta";
		sehirler[1][1] = "antalya";
		sehirler[1][2] = "izmir";
		sehirler[2][0] = "konya";
		sehirler[2][1] = "manisa";
		sehirler[2][2] = "denizli";
		
		for(int i=0;i<=2;i++) {
			for(int k=0;k<=2;k++) {
				System.out.println(sehirler[i][k]);
			}
		}
		
		
	}

}
