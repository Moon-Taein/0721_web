package my;

public class test {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		int sum = m.plus(10, 20);
		System.out.println(sum == 30);
	}
}