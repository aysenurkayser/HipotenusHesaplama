import java.util.Scanner;

public class hipotenushesaplama {

	public static void main(String[] args) {
		int akenari, bkenari;
		double hipoten�s;
		Scanner scan = new Scanner(System.in);
		System.out.println("A kenar�n� giriniz: ");
		akenari = scan.nextInt();
		System.out.println("B kenar�n� giriniz: ");
		bkenari = scan.nextInt();
		hipoten�s = Math.sqrt((akenari * akenari) + (bkenari*bkenari)) ;
		System.out.println("Hipoten�s uzunlu�u " + hipoten�s);
	}

}
