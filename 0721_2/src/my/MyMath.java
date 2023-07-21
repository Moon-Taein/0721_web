package my;

public class MyMath {

	public int plus(int a, int b) {
		return a + b;
	}

	// 정수가 0~100사이면 true 반환
	public boolean rangeZeroBetweenHund(int target) {
		if (target >= 0 && target <= 100) {
			return true;
		}
		return false;
	}
}