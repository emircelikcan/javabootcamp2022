package arrayDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String ogrenci1 = "Emir";
	String ogrenci2 = "Esma";
	String ogrenci3 = "Yasin";
	
	System.out.println(ogrenci1);
	System.out.println(ogrenci2);
	System.out.println(ogrenci3);
	
	
	System.out.println("--------------------------------------");
	
	
	String[] ogrenciler = new String[3];
	ogrenciler[0]="Emir";
	ogrenciler[1]="Esma";
	ogrenciler[2]="Yasin";
	//ogrenciler[3]="Arda"; (Out of Bounds)
	
	for (int i = 0; i < ogrenciler.length; i++) {
		
		System.out.println(ogrenciler[i]);
		
	
	}
	
	
	System.out.println("-------------------------------------");
	
	for (String ogrenci : ogrenciler) {
		
		System.out.println(ogrenci);
		
	}
			
		
	
	
	
	
	
	
	
	
	
	}

}
