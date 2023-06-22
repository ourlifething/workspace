import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SushiApp {
	public static void main(String[] args) {
		//寿司アプリ作成
		Scanner sc = new Scanner(System.in);
		List<String> data = new ArrayList<>();
		while(true) {
			System.out.print(" 何食べる ？（e:終了） > > ");
			String input = sc.next();
			if(input.equalsIgnoreCase("e")) {
				break;
			}
			data.add(input);
		}
		
		System.out.println(data);
		System.out.printf("%d皿（%d円）%n",data.size(),data.size()*100);
		Set<String> set = new HashSet<>(data);
		System.out.println("今日は");
		System.out.println(set);
		System.out.println(set.size() + "種類食べたよ");

	}

} 
