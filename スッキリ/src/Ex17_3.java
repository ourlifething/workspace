
public class Ex17_3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
			System.out.println(i);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("正常終了");
	}

}
