package sample;

public class PassworfGenerator {
	public static void main(String[] args){
		for(int k = 0; k < 1000; k++){
			String p = "ABCDEFGH";
			int rnd =0;

		while(rnd != 9){
			rnd = (int)(Math.random() * 10);
			if( rnd == 8){
				continue;
			}else if(rnd == 9){
				break;
			}

			String target = p.substring(rnd,(rnd + 1));
			String lowerString = target.toLowerCase();
			p = p.replace(target, lowerString);

		}

		if (p.equals("AbCdEfGh")){
			p = "pass";
		}else if(p.contains("def")){
			p = "define";
		}
		System.out.println(p);
		System.out.println(p.length());
		}
	}

}
