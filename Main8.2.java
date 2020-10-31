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


}