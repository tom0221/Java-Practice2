// コード9-10
public class Hero {
	String name;
	int hp;

	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}

	// 逃げる
	public void
}