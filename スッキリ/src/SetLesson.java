import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SetLesson {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>(); //HashSet --> LinkedHashSet を使うと格納順番通りに出力できる
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		
		for(String s: colors) {
			System.out.println(s);
		}

		//Set:種類関連に利用すると便利 1~6の数字を全て揃う回数
		int count = 0;
		Set<Integer> dices = new HashSet<>();
		Random rand = new Random();
		while(dices.size()<6) {
			count++;
			int dice = rand.nextInt(6)+1;
			System.out.println(dice);
			dices.add(dice);
		}
		System.out.println(count + "回で全部揃いました");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("何回 >>");
		int n = sc.nextInt();
		Set<Integer> data = new HashSet<>();
		for(int i=0; i<n; i++) {
			int dice = rand.nextInt(6)+1;
			System.out.println(dice);
			data.add(dice);
		}
		if(data.size()==1) {
			System.out.println("ゾロ目！");
		}else {
			System.out.println("ゾロ目ではありません");
		}
	
		List<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(3);
		nums.add(2);
		nums.add(5);
		nums.add(5);
		nums.add(4);
		System.out.println(nums); //ArrayListはリスト変数名を入れるだけで配列で出力
		Set<Integer> ns = new HashSet<>(nums); //Listからsetに変換
		System.out.println(ns.size() + "種類あります");
		System.out.println(ns);
		System.out.println(ns.size() + "種類あります");
	}
}
