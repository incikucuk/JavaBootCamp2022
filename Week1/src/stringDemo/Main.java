package stringDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj ="The weather is nice today";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayisi: "+mesaj.length());
		System.out.println("5. eleman"+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Hello!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("XX"));
		
		char[] characters = new char[5];
		mesaj.getChars(0,5, characters, 0);
		System.out.println(characters);
	    System.out.println(mesaj.indexOf("he"));
	    System.out.println(mesaj.lastIndexOf("a"));
	    
	    //String2
	    String yeniMesaj = mesaj.replace(' ', '-');
	    System.out.println(yeniMesaj);
	    System.out.println(mesaj.substring(2,5));
	    
	    for(String kelime: mesaj.split(" ")) {
	    	System.out.println(kelime);
	    }
	    
	    System.out.println(mesaj.toCharArray());
	    System.out.println(mesaj.toUpperCase());
	    System.out.println(mesaj.trim());
	}

}
