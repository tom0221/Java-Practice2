// 練習6-1
import comment.Zenhan;//Zenhanクラスだけインポートする
public class Main {
	public static void main(String[] args) throws Exception {
		doWarusa();
		doTogame();
		comment.Kouhan.callDeae();//commentパッケージのKouhanクラスを指定する。
		comment.Kouhan.showMondokoro();
	}


	/*Zenhan.javaへ移動*/

	// public static void doWarusa() {
	// 	Syetem.out.println("きなこでござる。食えませんがの。");
	// }

	// public static void doTogame() {
	// 	System.out.println("この老いぼれの目はごまかせませんぞ。");
	// }


	/*Kouhan.javaへ移動*/

	// public static void callDeae() {
	// 	System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
	// }

	// public static void showMondokoro() throws Exception {
	// 	System.out.println("飛車さん、角さん。もういいでしょう。");
	// 	System.out.println("この紋所が目に入らぬか！");
	// 	doTogame();
	// }
}