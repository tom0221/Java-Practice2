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
				System.out.println("いいね");
				break;
			case 3:
				System.out.println("普通です");
				break;
			case 4:
			case 5:
				System.out.println("うーん・・・");
		}
	}
}