public class Main {
	public static void main(String[] args) {
		// 配列変数の宣言↓箱を用意する
		int[] scores;
		scores = new int[5];
		int num = scores.length;
		System.out.println("要素の数" + num);

		// (続き)配列の要素に値を代入
		scores[1] = 30;
		System.out.println(scores[1]);
		// 配列は初期値が自動設定される
		System.out.println(scores[0]);

		// for文を使って配列を扱う(要素が変わっても一切影響なし)
		int[] scores = {20, 30, 40, 50, 80};
		for (int i = 0; i < scores.length; i++) {
		    System.out.println(scores[i]);
		}

		// 点数評価プログラム(for文の利用)
		int[] = scores = {20, 30, 40, 50, 80};
		int sum = 0;//集計結果を入れるために変数を初期化する
		for (int i = 0; i < scores.length; i++) {
		    sum += scores[i];//1科目ずつ変数sumに合算
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}