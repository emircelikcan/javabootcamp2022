package stringsDemo;


public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		// Eleman sayısını yazdır
		System.out.println("Eleman sayısı : " + mesaj.length());
		// 5. elemanı yazdır
		System.out.println("5. eleman : " + mesaj.charAt(4));
		// birleştir
		System.out.println(mesaj.concat(" Yaşasın!"));
		// boolean
		System.out.println(mesaj.startsWith("Bu"));
		System.out.println(mesaj.endsWith("l."));
		// karakter alma
		char[] karakterler = new char[21];
		mesaj.getChars(0, 21, karakterler, 0);
		System.out.println(karakterler);
		// karakter bulma 
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		// lastIndex sağdan saymaya başlar
		
		// karakter değiştirme
		System.out.println(mesaj.replace(' ', '-'));
		// -itibaren yazdır
		System.out.println(mesaj.substring(11,15));
		// küme ayrımı
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		// harfleri büyültür ve küçültür
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.toLowerCase());
		// boşlukları atar
		System.out.println(mesaj.trim());
	

	
	
	
	
	
	
	}

}
