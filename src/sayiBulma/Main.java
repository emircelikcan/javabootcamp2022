package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 9;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (aranacak==sayi) {
				varMi = true;
			break;
			}
		}
	
	if (varMi) {
		System.out.println("sayı dizi içerisinde mevcuttur");
	} else {
		System.out.println("sayı dizi içerisinde mevcut değildir");
	}
	
	}
	

}
