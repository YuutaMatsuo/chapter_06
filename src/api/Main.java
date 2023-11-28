package api;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ランダムで数値を生成（１～１００）
		int random = new Random().nextInt(1, 100);

		// 1つの文字列入力を受け付ける
		String word = new Scanner(System.in).nextLine();

		int[] heights = { 172, 149, 152, 191, 155 };
		java.util.Arrays.sort(heights);
		for (int height : heights) {
			System.out.println(height);
		}
	}
}
