package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// mainメソッド

		int a = 10;
		int b = 2;
		int addResult = add(a, b);
		int subtractResult = subtract(a, b);
		int multiplyResult = multiply(a, b);
		int divideResult = divide(a, b);
		printResult(addResult);
		printResult(subtractResult);
		printResult(multiplyResult);
		printResult(divideResult);

	}

	// メソッド1: 足し算
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	// メソッド2: 引き算
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	// メソッド3: 掛け算
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}

	// メソッド4: 割り算
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	// メソッド5: 結果を出力

	public static void printResult(int result) {

		System.out.println("計算結果は" + result + "です");

	}

}
