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
		System.out.print("しりとりスタート\n");  
		for(int i=0;i<7;i++) {//ここで回数を縛っている理由は永遠に続くため
			cuiv2 random=new cuiv2();
			String sum=random.cuiv3();
			//String txt=random.cuiv3(args);
			File file=new File(sum);
			if(!file.exists()) {
				System.out.print("ファイルが取得できません");
			}
			FileReader fileReader = new FileReader(file);
			BufferedReader br =new BufferedReader(fileReader);
			
			Scanner scanner=new Scanner (System.in);
			String end="終わり";
			String scannerend=scanner.nextLine();
			if(!end.equals(scannerend)) {
			System.out.print("\n文字入力続ける....終わりで終わり\n");
//			String s =scanner.nextLine();//入力受付}
				
	//		scanner.nextLine();
			 
			String chert = scannerend;
			String last=chert.substring(chert.length()-1);
			char[] lastcher=last.toCharArray();
			//System.out.print(lastcher);
			String stringcher=String.valueOf(lastcher);
			String regex="^"+stringcher+".*";
	//		System.out.print(regex);^i.*が入っている（最後の文字による）
			Pattern p = Pattern.compile(regex);
			//System.out.print(p);//^i.*
			
			//		マッチング機構
			String mat="";
			//手直しが必要
			while((mat=br.readLine()) !=null) {
				Matcher m =p.matcher(mat);
				
				if(m.find ()) {
					System.out.print(m.group());
				}
			}}else {
				scanner.close();
				br.close();
				System.out.println("終わり");
				break;
			}
			br.close();
//			
		}
	}
}
/*
 * scanner.closeするとエラーが出るので閉じないが完成
 * 改善点はテキストファイル構成を配列化
 * テキストファイル読み込みも配列化すると管理も改善も楽
 * 取説　
 * cuiでのしりとりプログラム
 * 実行して
 * スタートでなんでもいいので入力
 * 次の文字からスタート
 * このプログラムを終了させたら終了
 */
