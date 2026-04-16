/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println(
				"売上の割合");
		System.out.println("売上合計  \\" + kane);

		double sitorowariai = sitoroko / totalcount;
		double shokorawariai = shokorako / totalcount;
		double pisuwariai = shokorako / totalcount;

		int shokoragoukei = (int) shokorako * 280;
		int sitorogoukei = (int) sitoroko * 250;
		int pisugoukei = (int) pisuko * 320;

		System.out.println("シトロン" + "\\" + sitorogoukei + "・・・" + (int) (sitorowariai * 100) + "%");
		System.out.println("ショコラ" + "\\" + shokoragoukei + "・・・" + (int) (shokorawariai * 100) + "%");
		System.out.println("シトロン" + "\\" + pisugoukei + "・・・" + (int) (pisuwariai * 100) + "%");

		System.out.println("明日の三色マカロンの配合が決まりました。");

		System.out.println("シトロンの味    ・・・" + (int) (sitorowariai * 100) + "%");
		System.out.println("ショコラの味    ・・・" + (int) (shokorawariai * 100) + "%");
		System.out.println("ピスターシュの味・・・ " + (int) (pisuwariai * 100) + "%");

		System.out.println("が楽しめます。");

		int mixprice = (int) (totalmoney / totalcount);

		System.out.println("値段は" + mixprice + "円です。");

	}

}
