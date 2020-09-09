// スッキリわかるJava入門
// コメント例1(行末まで)
/*コメント例2(複数行でも可)*/
public class Main {
	public static void main(String[] args) {
		System.out.println("すがわら");
		System.out.println("31歳です");
		System.out.println("お酒が好きです");
		System.out.println("31 + 31の計算をします");
		System.out.println(31 + 31);
		System.out.println(35 - 10);
		System.out.println(-5 * 2);
		System.out.println(6 * 6 * 3.14);
		System.out.println("答えは" + 64);

		// 変数宣言
	    int age;
	    age = 30;
	    System.out.println("私の年齢は"+ age + "です");
	    // 変数の上書き
	    age = 35;
	    System.out.println("でも本当は" + age + "なんです");

	    // finalをつけ書き換えを防止
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		//PI = 10;
		//System.out.println("半径" + pie + "cmのパイの面積は、");
		//System.out.println(pie * pie * PI);
	}
}