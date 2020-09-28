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
	}
}