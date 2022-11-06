import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int a = input.nextInt();
		System.out.println(factorial(a));
		
		input.close();
	}	
	
	public static int factorial(int n) {
			
			if(n == 1) {
				return 1;
				
			}else
				return n * factorial(n-1);
			
	}
		
	

}
