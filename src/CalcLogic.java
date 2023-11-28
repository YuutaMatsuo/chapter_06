
public class CalcLogic {
	public static int tasu(int a, int b) {
		//同じクラスの別メソッドを呼び出す場合はクラス名.は不要
		hiku(a,b);
		return (a + b);
	}

	public static int hiku(int a, int b) {
		return (a - b);
	}
	
	//クラスを分けてもオーバーロードをすることが出来る
	public static int hiku(int a, int b,int c) {
		System.out.println(c);
		return (a - b);
	}
}
