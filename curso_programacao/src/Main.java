import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main (String[] args) {
	/*System.out.println("Digite um numero?");
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();*/
		Locale.setDefault(Locale.US);
		System.out.println("Digite o raio");
		Scanner se = new Scanner(System.in);
		double r;
		
		r = se.nextDouble();
		
		double s;
		s= Math.pow(r, 2);
		
		double p = 3.14159 * s;
		
		
		
		
		System.out.println(" O valo da área"  + p);
		
	}
		
		

	

}
