package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greeting {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try{
		System.out.println("今何時ですか？時だけ答えてください");
		String hour = reader.readLine();
		int h = Integer.parseInt(hour);
		if (0<= h && h <= 11){
			System.out.println("おはようございます");
		}else if (h == 12){
			System.out.println("お昼です");
		}else if (13 <= h && h<=18){
			System.out.println("こんにちは");
		}else if (19 <= h  && h<= 23){
			System.out.println("こんばんわ");
	 	}else {
	 		System.out.println("時間の範疇を超えています。");
		}
	} catch(IOException e){
		System.out.println(e);
	} catch (NumberFormatException e){
		System.out.println("数字の形式が正しくありません");
		}
	}
}
