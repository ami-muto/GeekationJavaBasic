package basicSyntax;

public class Variables {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

        // 好きな数字を代入
        int num1 = 22;
        double num2 = 3.14;

        // 共通メッセージを変数に
        String msgInt = "私の好きな整数は";
        String msgDouble = "私の好きな小数は";

        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(msgInt + num1 + "です。");
        System.out.println(msgDouble + num2 + "です。");
    }
}