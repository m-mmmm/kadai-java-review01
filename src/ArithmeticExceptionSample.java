
public class ArithmeticExceptionSample {

	public static void main(String[] args) {
		// double型10.0をint型0.0で除算
		double a = 10.0 / 0.0; //　ここで、例外が発生！

		//この下の出力は実行される！！
		System.out.println(a);

	}

}
