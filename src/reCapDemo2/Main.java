package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] myList = new double[4];
		myList[0] = 1.2;
		myList[1] = 1.3;
		myList[2] = 4.3;
		myList[3] = 5.6;

		double total = 0;

		double max = myList[0];

		// eski en büyük sayıyı bulma yolu
		if (max < myList[1]) {
			max = myList[1];

		}

		if (max < myList[2]) {
			max = myList[2];

		}

		if (max < myList[3]) {
			max = myList[3];

		}

		System.out.println("En Büyük Sayı = " + max);

		for (double number : myList) {
			// kolay en büyük sayıyı bulma yolu
			if (max < number) {

				max = number;

			}
			// toplam
			total = total + number;

			System.out.println(number);

		}

		System.out.println("Toplam = " + total);
		
		System.out.println("En Büyük Sayı = " + max);

	}

}
