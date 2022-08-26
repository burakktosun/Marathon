package buraktosunmaraton;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");
	}

	public static void readInput() {

		double perimeter;
		double area;
		double sideA, sideB, sideC, sideD;
		int i = 1;
		boolean cont = true;
		ShapeTest shapeTest = new ShapeTest();
		while (cont) {
			System.out.println(
					"Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) kenar uzunluklarini giriniz (-1 ile cikis) ");
			Scanner scan = new Scanner(System.in);

			System.out.println("Lutfen 1.kenar uzunlugunu giriniz (0 ile sonlandir)");
			sideA = scan.nextDouble();
			if (sideA < -1) {
				System.out.println("Tanimsiz uzunluk girdiniz");
				shapeTest.readInput();
			}
			if (sideA == 0) {
				System.out.println("Kenar girisi yapilmadi");
				shapeTest.readInput();
			}

			if (sideA == -1)

			{
				break;
			}
			System.out.println("Lutfen 2.kenar uzunlugunu giriniz (0 ile sonlandir)");
			sideB = scan.nextDouble();
			if (sideB < -1) {
				System.out.println("Tanimsiz uzunluk girdiniz");
				shapeTest.readInput();
			}

			if (sideB == 0) {
				System.out.println("Kenar girisi yapilmadi");
				shapeTest.readInput();
			}

			if (sideB == -1) {

				break;
			}
			System.out.println("Lutfen 3.kenar uzunlugunu giriniz (0 ile sonlandir)");
			sideC = scan.nextDouble();
			if (sideC < -1) {
				System.out.println("Tanimsiz uzunluk girdiniz");
				shapeTest.readInput();
			}
			if (sideC == 0) {
				System.out.println("2 kenarli sekil olamaz!");
				shapeTest.readInput();
				break;
			}
			if (sideC == -1)

			{
				break;
			}
			System.out.println("Lutfen 4.kenar uzunlugunu giriniz (0 ile sonlandir)");
			sideD = scan.nextDouble();
			if (sideD < -1) {
				System.out.println("Tanimsiz uzunluk girdiniz");
				shapeTest.readInput();
			}
			if (sideD == -1)

			{
				break;
			}

			switch ((int) sideD) {
			case (0):
				perimeter = (sideA + sideB + sideC);
				System.out.println(+i + ". Ucgenin cevresi: " + perimeter);

				area = ((sideA * sideB) / 2);
				System.out.println(+i + ". Ucgenin Alani: " + area);

				break;

			default:
				perimeter = (sideA + sideB + sideC + sideD);
				System.out.println(+i + ". Dortgenin Cevresi: " + perimeter);

				area = (sideA * sideB);
				System.out.println(+i + ". Dorgenin Alani" + area);
				i++;
			}

		}
	}
}
