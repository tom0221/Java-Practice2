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

	// コード5-5 ここまで

	// コード5-7 戻り値の例
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;//return文はメソッドの終了も含む
	}

	public static void main(String[] args) {
		int ans = add(100, 10);//ここでaddメソッドへ移動
		System.out.println("100 + 10 = " + ans);
    }

    // コード5-7 ここまで

	// コード5-8 戻り値をそのまま使う(mainから実行される)
	public static int add(int x, int y) {
	    int ans = x + y;
	    return ans;
	}

	public static void main(String[] args) {
	    System.out.println(add(10, 20), add(30, 40));
	}

	// コード5-10 オーバーロード(引数のデータ型が異なる場合)

	// 1つ目のaddメソッド
	public static int add(int x, int y) {
	    return x + y;
	}

	// 2つ目のaddメソッド
	public static double add(double x, double y) {
	    return x + y;
	}

	// 3つ目のaddメソッド
	public static String add(String x, String y) {
	    return x + y;
	}

	public static void main(String[] args) {
	    System.out.println(add(10, 20));          //1つ目のメソッドが呼び出される
	    System.out.println(add(3.5, 2.7));        //2つ目のメソッドが呼び出される
	    System.out.println(add("Hello", "World"));//3つ目のメソッドが呼び出される
	}

	// コード5-11 オーバーロード(引数の数が異なる場合)
	public static int add(int x, int y) {
	    return x + y;
	}

	public static int add(int x, int y, int z) {
	    return x + y + z;
	}

	public static void main(String[] args) {
	    System.out.println("10+20=" + add(10, 20));
	    System.out.println("10+20+30=" + add(10, 20,30));
	}


}