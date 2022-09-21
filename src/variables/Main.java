package variables;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Hello World!");
	
	int ogrenciSayisi = 40;
	String mesaj ="Öğrenci sayısı : "; 
	
	//doğru bellek yönetimi
	System.out.println(mesaj + ogrenciSayisi);
	System.out.println(mesaj + ogrenciSayisi);
	System.out.println(mesaj + ogrenciSayisi);
	
	//yanlış bellek yönetimi
	System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
	System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
	System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
	
	
	
	}

}
