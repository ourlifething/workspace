
public class ExceptionLesson {

	public static void main(String[] args) throws InterruptedException {
		//methodA();
		Person p = new Person();
		try {
			p.setAge(-10);
		}catch(IllegalArgumentException e) { // Exceptionのみでも良い
			System.out.println(e.getMessage());
		}
		System.out.println("終了");
		
		
		//オリジナルの例外処理
		try {
			String ext = "wav";
			if(!ext.equals("mp3")) {
				throw new UnsupportedMusicFileException("未対応のファイルです");
			}
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void methodA() throws InterruptedException {
		System.out.println("Start");
		Thread.sleep(3000);
		System.out.println("End");
	}

}
class Person{
	int age;
	public void setAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("年齢は０以上を指定すべきです");
		}
		this.age = age;
	}
}
//オリジナル例外を定義する
class UnsupportedMusicFileException extends Exception{
	//エラーメッセージを受け取るコンストラクタ
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}
}