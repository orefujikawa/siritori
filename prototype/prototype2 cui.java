import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cui2.cuiv2;
public class cui {

	public static void main(String[] args) throws IOException {
		cuiv2 random=new cuiv2();
		String sum=random.cuiv3();
		//String txt=random.cuiv3(args);
		
		File file=new File(sum);
		
		if(!file.exists()) {System.out.print("ファイルが取得できません");}
		FileReader fileReader = new FileReader(file);
		BufferedReader br =new BufferedReader(fileReader);
		
		Scanner scanner=new Scanner (System.in);
		System.out.print("文字入力続ける\r\n終わりで終わり");
		
		
		String o="おわり";
		String s =scanner.nextLine();//入力受付}
		
		String mat="";
		while(mat!=null){
		if(!(o.equals(s))){
			System.out.print("しりとりスタート\n");   }
		int i=0;
		while(i<5){
			
				   scanner.nextLine();
		 
		String chert = s;
		String last=chert.substring(chert.length()-1);
		char[] lastcher=last.toCharArray();
		//System.out.print(lastcher);
		String stringcher=String.valueOf(lastcher);
		String regex="^"+stringcher+".*";
//		System.out.print(regex);^i.*が入っている（最後の文字による）
		Pattern p = Pattern.compile(regex);
		//System.out.print(p);//^i.*
		

		//		マッチング機構
		
		
		while((mat=br.readLine()) != null) {
			Matcher m =p.matcher(mat);
//			System.out.print(m);
//			mも中に三つはいっているからif forで切り分ける
			if(m.find ()) {
				System.out.print(m.group());
//				for(int i=1;i>=m.groupCount();i++) 人のを乗っけようとしたがいやなのでやめた
//				{System.out.println(m.group(i));}
//				int a=1;
//				if(a>=m.groupCount()){これいらない
//					break;}
			
			//}else {System.out.print("マッチングなし");
		}}i++;}
		}
		
			scanner.close();
			br.close();
		}}
/////////////////////////////////////////////////////////////////////////////////////////
scannerは動いても検索は動いてくれない
