public class Main{
	public static void main(String[] args){

		// 条件分岐で、天気による行動の変化を表示
		boolean tenki = true;
		if(tenki == true){
			System.out.println("選択をします");
			System.out.println("散歩に行きます");
		}else{
			System.out.println("DVDを見ます");
		}

		// while文で繰り返し処理(次の行をtrueにすると無限ループ)
		boolean doorClose = false;
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}

		// 冗長でスッキリしない見本 if-else文
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
		    System.out.println("大吉");
		} else if (fortune == 2) {
		    System.out.println("中吉");
		} else if (fortune == 3) {
		    System.out.println("吉");
		} else {
		    System.out.println("凶");
		}

		// ↑をswitch文に書き直し(適切)
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		// switchの後には変数名を書く。
		switch (fortune) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}

		// あえてbreak文を書かないswitch例文
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			case 1:
			case 2:
				System.out.println("いいね！");
				break;
			case 3:
				System.out.println("普通です。");
				break;
			case 4:
			case 5:
				System.out.println("うーん・・・");
		}


		// while構文(基本形で前置判定)
		while (temp > 25) {
			temp--;
			System.out.println("温度を1度下げました");
		}

		// do-while構文
		do {
			temp--;
			System.out.println("温度を1度下げました");
		} while (temp > 25);

		// 基本的なfor文
		for (int i = 0; i < 10; i++) {
		    System.out.println("こんにちは");
		}

		// for文のループ変数jの内容を表示する
		for (int f = 0; f < 3; f++) {
		    System.out.println("現在" + (f + 1) + "周目→");
		}

		// 複雑なfor文
		// ①ループ変数を1からスタートする
		for (int g = 1; g < 10; g++){...}
		// ②ループ変数を2ずつ増やす
		for (int g = 0; g < 10; g += 2){...}
		// ③ループ変数を10から1ずつ1まで減らす
		for (int g = 10; g > 0; g--){...}
		// ④ループ変数を初期化しない
		for (; g < 10; g++){...}
		// ⑤繰り返し時の処理を実行しない
		for (int g = 0; i < 10;){...}

		// ネストされた制御構造(分岐)
        if (height > 170) {
            if (eyesight > 1.0) {
                System.out.println("合格");
            }
        }

		// ネストされた制御構造(繰り返し)
		do {
		    if (i % 3 == 0) {
		        System.out.println(i);
		    }
		    i++;
		} while (i < 100);

		// for文のループを2重にし、九九の表を出力
		for (int i = 1; i < 10; i++) {
		    for (int j = 1; j < 10; j++) {
		        System.out.println(i * j);//掛け算の結果を出力
		        System.out.println(" ");//空白を出力
		    }
		    System.out.println("");//改行を出力
		}

		// break文(繰り返し処理自体を中断させる)
		for (int i = 1; i < 10; i++) {
		    if (i == 3) {
		        break;
		    }
		    System.out.println(i);
		}

		// continue文(今回の周のみ中断スキップし、次の周へ)
		for (int i = 1; i < 10; i++) {
		    if (i == 3) {
		        continue;
		    }
		    System.out.println(i);
		}
	}
}