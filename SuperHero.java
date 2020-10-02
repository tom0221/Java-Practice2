// コード10-3 Hero10クラスを継承してSuperHeroを作成する
public class SuperHero extends Hero { //基本的にはHeroと同じという意味！
	boolean flying; // flying追加
	// ①追加したfly()
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	// ②追加したland()
	public void land() {
		this.flying = false;
		System.out.pritnln("着地した！");
	}


}