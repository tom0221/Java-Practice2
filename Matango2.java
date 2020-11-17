// Matangoクラス(2回目)
public class Matango {
	int hp;
	final int LEVEL = 10; // 初期値を10に設定する+finalをつけ定数として宣言する
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
}