/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		double sitoroko = Double.parseDouble(hmsitoro);
		double shokorako = Double.parseDouble(hmshokora);
		double pisuko = Double.parseDouble(hmpisu);

		double sitozaiko = (30 - sitoroko);
		double shokozaiko = (30 - shokorako);
		double pisuzaiko = (30 - pisuko);

		double totalcount = sitoroko + shokorako + pisuko;

		double totalmoney = (sitoroko * 250) + (shokorako * 280) + (pisuko * 320);

		int kane = (int) totalmoney;
		int sitoronokori = (int) sitozaiko;
		int shokoranokori = (int) shokozaiko;
		int pisunokori = (int) pisuzaiko;

		System.out.println("シトロン" + hmsitoro + "個・・・残り" + sitoronokori + "個");
		System.out.println("ショコラ" + hmshokora + "個・・・残り" + shokoranokori + "個");
		System.out.println("ピスターシュ" + hmpisu + "個・・・残り" + pisunokori + "個");

		System.out.println("合計個数" + totalcount + "個");
		System.out.println("合計金額" + kane + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました！");

	}

}
