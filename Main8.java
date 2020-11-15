// コード8-1 mainメソッドを作る
public class Main {
	public static void main(String[] args) {
		// ここへ勇者への指示を書いていく

		// 1.勇者を生成 (Heroクラスからインスタンスを生成し、変数hに入れる)
		Hero h = new Hero();

		// 2.hフィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");

		// 3.勇者のメソッドを順に呼び出していく
		h.sit(5);//5秒座れ
		h.slip();//転べ
		h.sit(25);//25秒座れ
		h.run();//逃げろ



		Matango m1 = new Matango();// お化けキノコAを生成し、初期化
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();// お化けキノコBを生成し、初期化
		m2.hp = 48;
		m2.suffix = 'B';

		// 冒険の始まり
		h.slip(); // 勇者転ぶ
		m1.run(); // お化けキノコA逃げる
		m2.run(); // お化けキノコB逃げる
		h.run(); // 勇者逃げる
	}
}