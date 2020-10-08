// コード10-11 コンストラクタを呼び出せない状況
public class Item {
	String name;
	int price;

	// 1つ目のインストラクタ
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}

	// 2つ目のインストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}