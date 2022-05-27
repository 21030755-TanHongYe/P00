
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b ;
	}
	public int multiple(int a, int b) {
		return a * b ;
		
	}
	public int divide(int a, int b) {
		if(a == 0 ||b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b ;
		
	}
}
