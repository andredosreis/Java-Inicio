import java.util.Scanner;



public class Main {

	public static void main (String[] args) {
		System.out.println("Digite um numero?");
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		System.out.println("Digite o segundo número");
		Scanner se = new Scanner(System.in);
		int y;
		
		y = se.nextInt();
		
		int s;
		s= x+y;
		
		System.out.println("A soma dos dois numeros sao"  + s);
		
	}
		
		

	

}
