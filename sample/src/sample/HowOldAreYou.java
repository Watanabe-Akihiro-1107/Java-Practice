package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
		String line;
		//一人目
		System.out.println("一人目の名前を入力してください");
		String name1 = reader.readLine();
		System.out.println(name1+"さんの年齢を入力してください");
		line = reader.readLine();
		int age1 = Integer.parseInt(line);
		//二人目
		System.out.println("二人目の名前を入力してください");
		String name2 = reader.readLine();
		System.out.println(name2 + "さんの年齢を入力してください");
		line = reader.readLine();
		int age2 = Integer.parseInt(line);
		//平均
		double avarage = (age1 + age2) / 2.0;
		System.out.println(name1 + "さんと" + name2 + "さんの平均年齢は" + avarage + "歳です");
		} catch (IOException e){
			System.out.println(e);
		} catch (NumberFormatException e ){
			System.out.println("年齢が正しくありません");
		}
	}
}
