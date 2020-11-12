// コード8-2 HeroクラスをJavaのコードで表す
public class Hero {
	// 属性を宣言するにはクラスブロックの中に変数宣言の記述をする
	String name;//名前の宣言
	int hp;//HPの宣言
	Sword sword;//勇者が持っている剣の情報をクラス型変数で宣言

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}

	/*以下Heroメソッドはクラス名と同一のため、コンストラクタとして自動的に実行される！
	Main9.javaのHeroの引数として文字列を1つ受け取るように。①*/
	public Hero(String name) {
		this.hp = 100;  //hpフィールドを100で初期化してる
		this.name = name;  //各々のname
	}

	// 引数を受け取らないコンストラクタも作成する②
	punlic Hero() {
		// this.hp = 100;
		// this.name = "ダミー";  //ダミーの名前を設定する

		//①のコンストラクタを利用する為に呼び出す方法
		this("ダミー");  //引数
	}




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

	// 逃げるrunメソッド
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this,hp + "でした");

	}

}