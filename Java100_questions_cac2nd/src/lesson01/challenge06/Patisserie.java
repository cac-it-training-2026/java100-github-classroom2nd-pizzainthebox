/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int sitozaiko = (30 - sitoroko);
		int shokozaiko = (30 - shokorako);
		int pisuzaiko = (30 - pisuko);

		int totalcount = sitoroko + shokorako + pisuko;

		int totalmoney = (sitoroko * 250) + (shokorako * 280) + (pisuko * 320);

		System.out.println("シトロン" + hmsitoro + "個・・・残り" + sitozaiko + "個");
		System.out.println("ショコラ" + hmshokora + "個・・・残り" + shokozaiko + "個");
		System.out.println("ピスターシュ" + hmpisu + "個・・・残り" + pisuzaiko + "個");

		System.out.println("合計個数" + totalcount + "個");
		System.out.println("合計金額" + totalmoney + "円");
		System.out.println("をお買い上げですね。");
		System.out.println("承りました！");

	}

}
