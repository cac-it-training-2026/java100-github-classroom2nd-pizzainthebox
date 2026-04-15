/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int sitoro = 30;
		int shoko = 30;
		int pisu = 30;

		System.out.println("シトロン      \\250 ・・・ 残り" + sitoro + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + shoko + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pisu + "個");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン＞");
		String hmsitoro = reader.readLine();

		System.out.print("ショコラ＞");
		String hmshokora = reader.readLine();

		System.out.print("ピスターシュ＞");
		String hmpisu = reader.readLine();

		int sitoroko = Integer.parseInt(hmsitoro);
		int shokorako = Integer.parseInt(hmshokora);
		int pisuko = Integer.parseInt(hmpisu);

		int totalcount = sitoroko + shokorako + pisuko;

		int totalmoney = (sitoroko * 250) + (shokorako * 280) + (pisuko * 320);

		System.out.println("シトロン" + hmsitoro + "個");
		System.out.println("ショコラ" + hmshokora + "個");
		System.out.println("ピスターシュ" + hmpisu + "個");

		System.out.println("合計個数" + totalcount + "個");
		System.out.println("合計金額" + totalmoney + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました！");

	}

}
