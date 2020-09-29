// コード9-1 Heroクラスをインスタンス化し利用する
public class Main {
	public static void main(String[] args) {
		// 一人目
		Hero h1 = new Hero();
		h1.hp = 100;
		h1.name = "ミナト";
		h.hp = 100;

		// 二人目
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		//Wizardの作る
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);  //h1ミナトを回復させる
		w.heal(h2);  //h2アサカを回復させる
		w.heal(h2);  //h2アサカを回復させる

		// コード9-4 剣を装備した勇者を生み出す
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		// h.name = "ミナト";
		// h.hp = 100;
		h.sword = s;//Swordフィールドの剣インスタンスの番地を代入
		System.out.println("現在の武器は" + h.sword.name);
	}
}