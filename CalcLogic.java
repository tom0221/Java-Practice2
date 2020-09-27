// 計算処理のメソッドを分離させ、CalcLogic.javaへ計算処理に追加する。
// package化させる場合、下一文追加
package calcapp.logics;
public class CalcLogic {
	public static int tasu(int a, int b) {
		return (a + b);
	}

	public static int hiku(int a, int b) {
		return (a - b);
	}
}