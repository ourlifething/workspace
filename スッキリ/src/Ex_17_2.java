
public class Ex_17_2 {

	public static void main(String[] args) {
		String s = null;
		try {                                
			System.out.println(s.length());   //メニューバー: ソース -> 囲
		} catch (NullPointerException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
	}

}
