// シンプルなメソッドの定義
public class Main {

	 // コード5-4 引数の例(渡す値が1つの場合)
	public static void main(String[] args) {
        System.out.println("メソッドを呼び出します");
        hello("湊");//メソッドの呼び出し
        hello("朝香");
        hello("菅原");
        System.out.println("メソッドの呼び出しが終わりました");
    }

	public static void hello(String name) {
		System.out.println("湊さん、こんにちは");
	}

	// コード5-4 ここまで

	// コード5-5 引数の例(渡す値が複数の場合)
	public static void main(String[] args) {
		add(100, 20);//メソッドの呼び出し
		add(200, 50);
	}

	// 複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}