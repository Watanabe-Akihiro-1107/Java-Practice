package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rain {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("明日の降水確率は何%ですか？");
			String percent = reader.readLine();
			int number = Integer.parseInt(percent);
			if (number > 100 || number < 0){
			System.out.println("数字は0~100で入力してください");
			} else if (number >= 50){
			System.out.println("傘を持って行った方がいい");
			} else {
			System.out.println("傘は持っていかなくていいよ");
			}
		} catch (IOException e) {
			System.out.println("e");
		} catch (NumberFormatException e){
			System.out.println("正しい数字を入力してください");
		}
	}
}
