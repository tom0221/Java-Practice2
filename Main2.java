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

		// String型をint型に変換する命令
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね");

		// ランダムな数を生成する命令
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん" + r + "歳ですね？");

		// キーボードから入力を受け付ける命令
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}
}