// コード8-2 HeroクラスをJavaのコードで表す
public class Hero {
	// 属性を宣言するにはクラスブロックの中に変数宣言の記述をする
	String name;//名前の宣言
	int hp;//HPの宣言


	public void sleep() {
		this.hp = 100;// thisは自分人身のインスタンスという意味
		System.out.println(this.name + "は、眠って回復した！");
	}
	// 座るsitメソッド 何秒座るかを引数で受け取る
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した！");
	}

	// 転ぶslipメソッド
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

}