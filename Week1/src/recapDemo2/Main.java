package recapDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] myList = {1.2,3.1,0.3,1.1,4.2};
		
		double total = 0;
		double max= myList[0];
		
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total += number;
			
		}
		System.out.println("total: "+ total);
        System.out.println("max: "+max );

	}

}
