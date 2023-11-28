package test.main; //パッケージ宣言文

//import test.logic.CalcLogic;// [Cntl] + [Shift] + [O](オー）を押すことでインポート文を自動追加
//test.logicパッケージ名に所属するすべてのクラスを対象にパッケージ名の省略ができる！
import test.logic.*;

//CalcLogicクラスのメソッドを呼び出すとき、パッケージ名「test.logic」が省略できるようになる
//import test.logic.CalcLogic;

public class Main {
	public static void main(String[] args) {
		// 別クラスのメソッド呼び出しに失敗...
//		Calclogic.tasu(10,20);

		// test.logicパッケージに所属する(calclogicクラス）のtasuメソッドを呼ぶ
		// *完全限定クラス名（完全修飾クラス名）
//		int total = test.logic.CalcLogic.tasu(20, 30); // 記述が長くなってしまう・・・
		int total = CalcLogic.tasu(20, 30); //import文のおかげでスッキリ！

		System.out.println("足し算：" + total);
	}
}
