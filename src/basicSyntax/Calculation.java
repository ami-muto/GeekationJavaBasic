package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

		int x = 5;
		int y = 10;
		int z = x + y;
		System.out.println("変数zの値は" + z + "です");
		
		
//	double型の変数aを宣言し、値5.25を代入
		double a =5.25;
//変数aの値に2.5を足して、結果を変数aに代入
		a += 2.5;
//変数aの値に3.0を掛けて、結果を変数aに代入
		a *= 3.0;
//変数aの値を整数(int)にキャストし、int型の変数bに代入
		int b = (int)a;
//変数bに10を足して、結果を変数bに代入
		b += 10;
//変数aの値と変数bの値をそれぞれコンソールに出力
		System.out.println("変数aの値は" + a + "です");
		System.out.println("変数bの値は" + b + "です");

	}

}
