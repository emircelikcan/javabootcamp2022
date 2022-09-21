package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'X';

		switch (grade) {

		case 'A':

			System.out.println("Mükemmel");

			break;

		case 'B':
			System.out.println("Çok İyi");

			break;

		case 'C':
			System.out.println("Geçti");

			break;

		case 'F':
			System.out.println("Kaldı");

			break;

		default:
			System.out.println("Geçersiz Not Girdiniz");

		}

	}

}
