package loopWhile;

public class Main {

	public static void main(String[] args) {
		//while
		
		int i=1;
		
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("Loop while finished!");
		
		//do-While
		int j = 100;
		do {
			System.out.println(j);
			j++;
			
		}while(j<10);
		
		System.out.println("Do-while finished!");

	}

}
