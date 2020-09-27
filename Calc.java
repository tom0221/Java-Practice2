// 第6章 複数クラスを用いた開発　〜コード6_4まで
public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);//CalcLogic.javaのtasuメソッドを呼び出す
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total +"、引くと" + delta);
	}

	// 以下の計算メソッドは、CalcLogic.javaへ移動
	// public static int tasu(int a, int b) {
	//     return (a + b);
	// }

	// public static int hiku(int a, int b) {
	//     return (a - b);
	// }
}