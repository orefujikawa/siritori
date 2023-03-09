package cui2;
import java.util.Random;

public class cuiv2 {

	public String cuiv3() {
		String ai="aaaa";
		String m = null;
//		System.out.print(ai);
//		String text[]={"\"C://Users/1107_7language/workspace/CUI.i/src/\"","\"2.txt\"","\"3.txt\"","\"4.txt\"","\"5.txt\"","\"6.txt\"",
//				"\"7.txt\"","\"8.txt\"","\"9.txt\"","\"10.txt\"","\"1\"","\"12.txt\"","\"13.txt\"",
//				"\"14.txt\"","\"15.txt\"","\"16.txt\"","\"17.txt\"","\"18.txt\"","\"19.txt\"","\"20.txt\"",
//				"\"2\"","\"22.txt\"","\"23.txt\"","\"24.txt\"","\"25.txt\"","\"26.txt\"","\"27.txt\"",
//				"\"28.txt\"","\"29.txt\"","\"30.txt\"","\"3\"","\"32.txt\"","\"33.txt\"","\"34.txt\"","\"35.txt\"",
//				"\"36.txt\"","\"37.txt\"","\"38.txt\"","\"39.txt\"","\"40.txt\"","\"4\"","\"42.txt\"","\"43.txt\"",
//				"\"44.txt\"","\"45.txt\"","\"46.txt\"","\"47.txt\"","\"48.txt\"","\"49.txt\"","\"50.txt\"","\"5\"",
//				"\"52.txt\"","\"53.txt\"","\"54.txt\"","\"55.txt\"","\"56.txt\"","\"57.txt\"","\"58.txt\"","\"59.txt\"",
//				"\"60.txt\"","\"6\"","\"62.txt\""};

		String text[]={
				"/Users/fujikawaatsushi/Desktop/javaしりとり/1.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/2.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/3.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/3.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/4.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/5.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/6.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/7.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/8.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/9.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/10.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/11.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/12.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/13.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/14.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/15.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/16.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/17.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/18.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/19.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/20.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/21.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/22.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/23.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/24.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/25.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/26.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/27.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/28.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/29.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/30.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/31.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/32.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/33.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/34.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/35.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/36.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/37.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/38.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/39.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/40.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/41.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/42.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/43.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/44.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/45.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/46.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/47.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/48.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/49.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/50.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/51.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/52.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/53.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/54.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/55.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/56.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/57.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/58.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/59.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/60.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/61.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/62.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/63.txt",
				"/Users/fujikawaatsushi/Desktop/javaしりとり/64.txt",
				};
		String a[]={"あ","い"};
		Random r = new Random();
		for (int i=0;i<1;i++) {
			String k=text[r.nextInt(62)];
			 m=k;
			//System.out.print(m);
			}
		return m;
		}}