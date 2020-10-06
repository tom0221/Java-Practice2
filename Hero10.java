// コード10-2
public class Hero {
	String name;
	int hp;

	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}

	// finalがついているfinalメソッドは子クラスでオーバーライド(上書き禁止)になる
	public void final slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		Syetem.out.println("5ポイントのダメージ！);
	}

	// 逃げる(finalはついてないので、runメソッドは子クラスでオーバーライド可能)
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}


}