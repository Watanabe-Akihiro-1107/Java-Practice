package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copy2 {
	public static void main(String[] args){
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	try{
		//このString型の変数をwhile文の中で定義したらエラーではじかれた。
		//while文の前で宣言しなきゃいけない理由があるんだろうけど今はわからない・・・
		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
		}
	}catch(IOException e){
		System.out.println(e);
	}
	}

}
