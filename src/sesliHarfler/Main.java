package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char harf='i';
		
		//benim çözümüm
		char[] kalınHarfler =  new char[4];
		kalınHarfler[0] = 'a';
		kalınHarfler[1] = 'ı';
		kalınHarfler[2] = 'o';
		kalınHarfler[3] = 'u';
		char[] inceHarfler = new char[4];
		inceHarfler[0] = 'e';
		inceHarfler[1] = 'i';
		inceHarfler[2] = 'ö';
		inceHarfler[3] = 'ü';
		
		for (int i = 0; i <= 4; i++) {
			
			if (harf==kalınHarfler[i]) {
				
				System.out.println("Kalın sesli harf");
				break;
			} else if(harf==inceHarfler[i]) {
				
				System.out.println("İnce sesli harf");
				break;
			} else {System.out.println("sessiz harf");}
		}
		
		// buglar var ileride çözücem
	
	System.out.println("---------------------------");
	
		// bir başka çözüm
	switch (harf){

	  case 'a':

	  case 'ı':

	  case 'o':

	  case 'u':

	  System.out.println("Kalın sesli jarf");

	  break;

	  case 'e':

	  case 'i':

	  case 'ö':

	  case 'ü':

	  System.out.println("İnce sesli harf");

	  break;

	  default:

	  System.out.println("Sessiz harf");}

	
	
	
	
	
	}
	

}
