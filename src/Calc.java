
public class Calc {
	// 実行用のクラスは(mainメソッドのみ)
	public static void main(String[] args) {
		// 別クラス(CalcLogicクラス）のメソッドを呼び出す
		int a = 10;
		int b = 2;
		// メソッドの呼び出しに失敗する
//		int total = tasu(a,b);
//		int delta = hiku(a,b);
//		System.out.println("足すと" + total + "、引くと" + delta);

		// クラス名.メソッド名という呼び出し方をする
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		int test = CalcLogic.hiku(a, b, 20);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
