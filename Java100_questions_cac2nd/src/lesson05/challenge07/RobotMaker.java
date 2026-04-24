/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題7  水量を表示する
 *
 * ロボット内の残水量を戻り値として返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。
 *
 *  G博士：
 *  そう言えばそうじゃな。よし、ちょっと待っとれ。
 *
 *  G博士：
 *  ......出来た！現在の水量を表示する機能じゃ。
 *
 *  「ガ～ピィーガ～、ゲンザイノスイリョウハ【※残水量】リットルデス。」
 *
 *  Rさん：
 *  なんか雑音が気になりますが、一応出来てますね。
 *
 */

package lesson05.challenge07;

import java.util.Random;

//ここに問題6で作成したクラスに次の条件を足したクラスを作成してください。
class Robot {
	int energy;
	String name;
	int water;

	public void randomWater() {
		Random rand = new Random();

		int output = rand.nextInt(9) + 1;
		System.out.println("水を" + output + "L出しました");
		this.water = water - output;

	}

	public void makeOmelet(int eggNum, int butterNum) {
		int tamakazu = eggNum / 2;
		int batakazu = butterNum / 5;

		int omumoto = Math.min(tamakazu, batakazu);
		System.out.println(omumoto + "人分のオムレツができました。");
	}

	int getWater() {
		return water;

	}

}
//メソッド名：makeOmelet(引数int eggNum ,int butterNum、戻り値void、
//入力されて材料の個数に併せてオムレツの個数を表示する)

public class RobotMaker {

	public static void main(String[] args) {

		System.out.println("Rさん：");
		System.out.println("でもこれランダムに水を入れた時にロボット内の水量がわかりませんね。\n");
		System.out.println("G博士：");
		System.out.println("そう言えばそうじゃな。よし、ちょっと待っとれ。\n");
		System.out.println("G博士：");
		System.out.println("......出来た！現在の水量を表示する機能じゃ。\n");

		int water = 30;

		//ここでRobotクラスのインスタンスを作り、
		Robot robot = new Robot();
		robot.water = water;

		//（インスタンス名はrobot）
		//randomWaterを実行する。
		robot.randomWater();
		//getWaterを実行する。
		water = robot.getWater();

		System.out.println("「ガ～ピィーガ～、ゲンザイノスイリョウハ" + water + "リットルデス。」\n");

		System.out.println("Rさん：");
		System.out.println("なんか雑音が気になりますが、一応出来てますね。\n");
	}

}
