// コード8-1 mainメソッド作成
public class Main {
	public static void main(String[] args) {
		// 1.勇者を生成(インスタンス化)
		Hero h = new Hero();
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");

		// 1匹目のお化けキノコを生成する
		Matango m1 = new Matabgo();
		m1.hp = 50;
		m1.suffix = 'A';

		// 2匹目のお化けキノコを生成する
		Matango m2 = new Matango();
		m2.hp = 28;
		m2.suffix = 'B';

		// 3.勇者のメソッドを呼び出す
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}