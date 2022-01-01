import java.util.Scanner;

public class hipotenushesaplama {

	public static void main(String[] args) {
		int akenari, bkenari;
		double hipotenüs;
		Scanner scan = new Scanner(System.in);
		System.out.println("A kenarýný giriniz: ");
		akenari = scan.nextInt();
		System.out.println("B kenarýný giriniz: ");
		bkenari = scan.nextInt();
		hipotenüs = Math.sqrt((akenari * akenari) + (bkenari*bkenari)) ;
		System.out.println("Hipotenüs uzunluðu " + hipotenüs);
	}

}
