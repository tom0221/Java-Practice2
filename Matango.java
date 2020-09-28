// コード8-5 フィールド宣言と同時に初期値を設定
public class Matango {
	int hp;
	final int LEVEL = 10;//変数を定数化するために文頭に①finalと②定数名大文字にする
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}