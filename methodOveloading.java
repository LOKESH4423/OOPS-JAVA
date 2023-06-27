public class methodOverloading {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static double add(double a,double b,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(1,2));// 3
		System.out.println(add(1,2,3));// 6
		System.out.println(add(1.1,2.8,3.1));// 7.0

	}
}
