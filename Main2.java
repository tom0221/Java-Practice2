public class Main {
	public static void main(String[] args) {
		int a;
		int b;
		a = 20;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);

		// エスケープシーケンスを用いた表現
		System.out.println("私の好きな記号は二重引用符¥"です");

		// インクリメント演算子
		int c;
		c = 100;
		c++;
		System.out.println(c);

		// 強制的な型変換(基本的に使わない)
		int age = (int)3.2;
		System.out.println(age);

		// 文字列の連結
		String msg = "私の年齢は" + 23;
		System.out.println(msg);

		// 改行なし出力
		String name = "すがわら";

		System.out.print("私の名前は");
		System.out.print(name);
		System.out.println("です");

		// 大きい方の数値を出力する命令
		int e = 5;
		int f = 3;
		int m = Math.max(e, f);
		System.out.println("比較実験：" + e + "と" + f + "とで大きい方は・・・" + m);
	}
}