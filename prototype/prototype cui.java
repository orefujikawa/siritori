import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class cui {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		File file=new File("\workspace\\CUI.i\\src\\ioa.txt");
		if(!file.exists()) {System.out.print("ファイルが取得できません");return;}
		FileReader fileReader = new FileReader(file);
		BufferedReader br =new BufferedReader(fileReader);
		
		Scanner scanner=new Scanner (System.in);
		System.out.print("入力");
		String s =scanner.nextLine();//入力受付
		
		String chert = s;
		String last=chert.substring(chert.length()-1);
		char[] lastcher=last.toCharArray();
		//System.out.print(lastcher);
		String stringcher=String.valueOf(lastcher);
		String regex="^"+stringcher+".*";
//		System.out.print(regex);^i.*が入っている（最後の文字による）
		Pattern p = Pattern.compile(regex);
//		System.out.print(p);^i.*
		String mat;
		while((mat=br.readLine())!=null) 
		{
			Matcher m =p.matcher(mat);
//			System.out.print(m);
			if(m.find()) {System.out.print(m.group());}
			}
//		String string=br.readLine();//readlineが検索を走らせているわけではない
//		System.out.print(string);
		
//		String str;//ここで全部表示させている
//		while((str = br.readLine())!= null) {
//			Matcher m = p.matcher(str);
//			if(m.find())
//				System.out.print(m);
//			{
				// System.out.print(m.group());
	//			String mat=m.group();
	//			System.out.print(mat);
	//		}
	//		Matcher m = p.matcher("ioa.txt");
	//		if(str.find()) {System.out.print(m.group());
	//		}else{System.out.print("マッチングなし");}
			scanner.close();
			br.close();
		}
	}
////////////////////////////////////////////////////////////////////////////////////
/*悩んだ場所

findメソッドは一致した場合に”true”を返すので、
while文のループで一致する文字列がなくなるまで検索と表示を繰り返しています。
findメソッドを使って郵便番号に一致した文字列をgroupメソッドで抽出して表示しています。

whileでリードラインを読み取ってtrueを返して次の文へ移動して
		
最後に悩んでいたポイントの答えは正規表現の間違いで＾の意味解釈の間違い
その後の文字列を認識させたければ正確には＾文字.*だった

問題点//////////////////////////////////////////////////////////////////////////////
マッチすると全部拾ってしまう
テキストファイルの一行に一文しかかけてないのでどう切り分けていけるか（それは思いついているが printline
テキストファイルの検索機構をもっと軽く早くできるはず
入力を繰り返すか聞く(文字で聞くのがいい

この子は別でプロトタイプとしてとっておこう！！！！！
		*/
