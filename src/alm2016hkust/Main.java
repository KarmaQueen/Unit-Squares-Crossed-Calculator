package alm2016hkust;

public class Main {
	
	public static void main(String[] args){
		
		System.out.println(unitSquaresCrossed(2, 2, 3));
		System.out.println(unitSquaresCrossed(3, 3, 3));
		System.out.println(unitSquaresCrossed(0, 0, 0));
		System.out.println(unitSquaresCrossed(1000000, 1000000, 1000000));
	}
	
	public static String unitSquaresCrossed(int a, int b, int c){
		long timeTaken = System.currentTimeMillis();
		int n = max(a + b - gcd(a,b), max(b + c - gcd(b,c), c + a - gcd(c,a)));
		timeTaken = System.currentTimeMillis() - timeTaken;
		return "Unit Squared Crossed:" + n + ", Time taken:" + (1.0F*n/1000);
	}
	
	public static int max(int a, int b){
		if(a > b) return a;
		return b;
	}
	
	public static int gcd(int a, int b){
		if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
	
}
