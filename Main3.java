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
	}
}