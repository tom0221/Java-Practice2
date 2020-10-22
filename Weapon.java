// コード10-11 コンストラクタを呼び出せない状況
public class Weapon extends Item {
	// なにも定義されていない場合は、デフォルトコンストラクタが定義され、動作する
	// super();

	// 内部インスタンスのコンストラクタ引数を指定する
	public Weapon() {
		super("ななしの剣");
	}
}