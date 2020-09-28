// 8章練習問題
public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	// 練習8-3
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.Max_Hp;// セルフエイドを唱える事でMAX_HPに回復する
		this.mp -= 5;
		System.out.println("HPが最大まで回復した！");
	}

	// 練習8-4 (戻り値は実際に回復したMPの量)
	public int pray() {
		System.out.println(this.name + "は" + sec + "秒間天に祈った");

		// 論理上に回復量を乱数を用いて決める
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量を計算
		int recoverActual = Math.min(this.MAX_HP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}