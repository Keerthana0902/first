import java.util.Scanner;

public class Fib{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scan.nextInt();
		System.out.println("Fibonacci series:");
		for(int i = 0; i < n; i++){
			System.out.println(fib(i));
		}
	}

	private static int fib(int n){
		if(n == 1){
			return 1;
		}
		if(n == 0){
			return 0;
		}
		else{
			return fib(n-1) + fib(n-2);
		}
	}
}