package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
//		int型の変数aとbを定義&任意の値を代入して、aがbより大きい場合にtrueを、そうでない場合にfalseと出力する
		
		int a = 10;
		int b = 5;
	    
		System.out.println(a > b); // aがbより大きい場合はtrue、そうでない場合はfalseを出力
		 
		
//		boolean型の変数isSunnyとisWarmが与えられたとき、天気が晴れかつ暖かい場合にtrueを、それ以外の場合にfalseと出力する
		boolean isSunny = true;  // 晴れかどうか
        boolean isWarm = true;  // 暖かいかどうか

        System.out.println(isSunny && isWarm); // 両方がtrueならtrue、それ以外はfalseを出力
		
		
		//		int型の変数int xとint yを定義&任意の値を代入して、xが0以上かつyが偶数の場合にコンソールにtrueと出力する
        int x = 5;   // 任意の値
        int y = 4;   // 任意の値

        System.out.println(x >= 0 && y % 2 == 0); // xが0以上かつyが偶数ならtrueを出力
        
        
        //		boolean型の変数hasPermissionを定義して、hasPermissionがfalseの場合にtrueと出力する
        boolean hasPermission = false; // 権限の有無

        System.out.println(!hasPermission); // hasPermissionがfalseならtrueを出力
	}

}
