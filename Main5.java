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

	// コード5-12 引数に配列を受け取るメソッドの利用
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);//配列を渡す
	}

	// コード5-13 同じ配列を参照しているかの確認
	public static void incArray(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        array[i]++;
	    }
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3};
	    incArray(array);
	    for (int = i: array) {
	        System.out.println(i);
	    }
	}

	// コード5-14 戻り値が配列の場合
	public static int[] makeArray(int size) {
	    int[] newArray = new int[size];
	    for (int i = 0; i < newArray.length; i++) {
	        newArray[i] = i;
	    }
	    return newArray;
	}

	public static void main(String[] args) {
	    int[] array = makeArray(3);
	    for (int i : array) {
	        System.out.println(i);
	    }
	}

	// 練習5-1
	public static void main(String[] args) {
	    introduceOneself();
	}

	public static void introduceOneself() {
	    String name = "湊";
	    int age = 19;
	    double height = 162.2;
	    char zodiac = '申';
	    System.out.println("私の名前は" + name + "です");
	    System.out.println("年齢は" + age + "です");
	    System.out.println("身長は" + height + "です");
	    System.out.println("十二支は" + zodiac + "です");
	}

	// 練習5-2
	public static void main(String[] args) {
	    String title = "お誘い";
	    String address = "use@xxx.com";
	    String text = "今度遊びませんか？";
	    email(title, address, text);
	}

	public static void email(String title, String address, String text) {
	    System.out.println(address + "に以下のメールを送信しました。");
	    System.out.println("件名：無題");
	    System.out.println("本文：" + text);
	}


	// 練習5-3(練習5-2に追記したのみ/更新部分が出力される)
	public static void main(String[] args) {
	    String title = "お誘い";
	    String address = "use@xxx.com";
	    String text = "今度遊びませんか？";
	    email(title, address, text);
	}

	public static void email(String address, String text) {
	    System.out.println(address + "に、以下のメールを送信しました。");
	    System.out.println("件名：無題");
	    System.out.println("本文：" + text);
	}

	public static void email(String title, String address, String text) {
	    System.out.println(address + "に、以下のメールを送信しました。");
	    System.out.println("件名：" + title);
	    System.out.println("本文：" + text);
	}

	// 練習5-4
	public static void main(String[] args) {
	    double triangleArea = calcTriangleArea(10.0, 5.0);
	    System.out.println("三角形の面積：" + triangleArea + "平方cm");
	    double circleArea = calcCircleArea(5.0);
	    System.out.println("円の面積" + circleArea + "平方cm");
	}

	public static double calcTriangleArea(double bottom, double height) {
	    double area = (bottom * height) / 2;
	    return area;
	}

	public static double calcCircleArea(double radius) {
	    double area = radius * radius * 3.14;
	    return area;
    }


}