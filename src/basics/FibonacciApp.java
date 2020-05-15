package basics;

public class FibonacciApp {

		public static void main(String[] args) {
			int n=4;
			System.out.println("Factorial of number "+n+" is "+ factorial(n));	
		}
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		else if(num == 1) {
			return 1;
		}
	      return factorial(num-1)*num;
}
}
