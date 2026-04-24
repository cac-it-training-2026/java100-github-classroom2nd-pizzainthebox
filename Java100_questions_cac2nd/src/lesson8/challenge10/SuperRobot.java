package lesson8.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobot {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ビリヤニを作ります");
		System.out.println("トマトかヨーグルトどちらを使用しますか？...>)");
		System.out.println("トマト>1・・・ヨーグルト>2");
		String base = reader.readLine();
		int base2 = Integer.parseInt(base);

		if (base2 == 1) {
			System.out.println("北インド風のビリヤニを作ります。");

		} else if (base2 == 2) {
			System.out.println("南インド風のビリヤニを作ります。");

		} else {
			System.out.println("1か2を入力してください。初めからやり直しです");
			return;

		}
		System.out.println("調理を初めます。まずは玉ねぎを揚げましょう！");

		fire onionCook = new fire();

		System.out.println("何g揚げますか？(100g単位で計算します)>");
		String onirain = reader.readLine();
		int rawOnion = Integer.parseInt(onirain);

		System.out.println(fridOnion * 15 + "分揚げます");

	}

}
