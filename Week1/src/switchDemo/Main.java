package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("You passed with A");
			break;
		case 'B':
			System.out.println("You passed with B");
			break;
		case 'C':
			System.out.println("You passed with C");
			break;
		case 'D':
			System.out.println("You passed with D");
			break;
		default:
			System.out.println("The grade is not invalid");
			
		}
	}

}
