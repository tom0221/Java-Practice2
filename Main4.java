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

		// コード4-10 点数評価プログラム(for文の利用)
		int[] = scores = {20, 30, 40, 50, 80};
		int sum = 0;//集計結果を入れるために変数を初期化する
		for (int i = 0; i < scores.length; i++) {
		    sum += scores[i];//1科目ずつ変数sumに合算
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);

		// コード4ー11 50点以上の科目の数を調べる
		int[] scores = {20, 30, 40, 50, 80};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
		    // 条件式(条件に合致するか判定)
		    if (scores[i] >= 50) {
		        count++;
		    }
		}
		System.out.println("50点以上の科目の数は" + count);


		// コード4-12 DNAの記号をランダム表示
		int[] seq = new int[10];

		// 塩基配列をランダム生成
		for (int i = 0; i < seq.length; i++) {
		    seq[i] = new java.util.Random().nextInt(4);
		}

		// 生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
		    switch (seq[i]) {
		        case 0:
		            System.out.println("A");
		            break;
		        case 1:
		            System.out.println("T");
		            break;
		        case 2:
		            System.out.println("G");
		            break;
		        case 3:
		            System.out.println("C");
		            break;
		    }
		}

		// 配列コードの上書き
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);

		// コード4-16 ガベージコレクション
		boolean judge = true;
		if (judge == true) {
		    int[] array = {1, 2, 3};//配列の中身は、ブロック外から参照できないgarbage
		    System.out.println(array[0]);
		}

		// コード4-17 nullの利用(nullを入れることで、参照しない状態に切る)
		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;

		// コード4-18 2次元配列
		int[] [] scores = new int[2] [3]; //2行で3列の意味
		scores[0] [0] = 40;
		scores[0] [1] = 50;
		scores[0] [2] = 60;
		scores[1] [0] = 80;
		scores[1] [1] = 60;
		scores[1] [2] = 70;
		System.out.println(scores[1] [1]);



	}
}