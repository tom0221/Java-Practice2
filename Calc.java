// 第6章 複数クラスを用いた開発　〜コード6_4まで
// package化する場合、下一文追加
package calcapp.main;
import calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);//CalcLogic.javaのtasuメソッドを呼び出す
		int delta = calcapp.logics.CalcLogic.hiku(a, b);//package指定の場合は前につける
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