// コード9-1 Heroクラスをインスタンス化し利用する
public class Main {
	public static void main(String[] args) {
		Hero h1;
		h = new Hero();
		h.hp = 100;

		Hero h2;
		h2 = h1;
		h2.hp = 200;
		System.out.println(h1.hp);

		// コード9-4 剣を装備した勇者を生み出す
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;//Swordフィールドの剣インスタンスの番地を代入
		System.out.println("現在の武器は" + h.sword.name);
	}
}