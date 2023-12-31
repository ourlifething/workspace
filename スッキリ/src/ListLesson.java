import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ListLesson {

	public static void main(String[] args) {
		//動的配列
		//Listは親クラスp626
		List<String> names = new ArrayList<String>(); //ArrayList<String> names = new ArrayList<>(); vr1.8は省略できる＜＞
		names.add("Jhon");
		names.add("Paul");
		names.add("George");
		names.add("Ringo");
		System.out.println(names.size()); //4 要素数 変数名.size()
		System.out.println(names.get(1)); //Paul   変数名.get(インデックスNo,)
		names.remove("Jhon");  //"Jhon"削除 remove(要素名)
		System.out.println(names.size()); //3 要素数
		System.out.println(names.get(1)); //George
		//要素数はフレキシブル
		names.remove(1);
		System.out.println(names.size()); //2 要素数
		System.out.println(names.get(1)); //Ringo
		
		for(int i=0; i<names.size(); i++) {  //要素数:names.size()
			System.out.println(names.get(i));  
		}
		for(String name:names) {  //拡張for文
			System.out.println(name);
		}
		/*
		 * Wrapper Class(ラッパークラス)
		 * int -> Integer
		 * double -> Double
		 * boolean -> Boolean
		 * char -> Character
		 * */
		ArrayList <Integer> nums= new ArrayList<>();
		nums.add(100);
		nums.add(200);
		for(int i :nums) {
			System.out.println(i);
		}
		
		ArrayList <Double> temps = new ArrayList <>();
		temps.add(21.4);
		temps.add(22.4);
		temps.add(24.4);
		for(double t : temps) {
			System.out.println(t);
		}
		
		ArrayList <Boolean> bools = new ArrayList<Boolean>();
		bools.add(true);
		bools.add(false);
		bools.add(false);
		for(boolean b : bools) {
			System.out.println(b);
		}
		
		ArrayList <Character> chars = new ArrayList<>();
		chars.add('A');
		chars.add('B');
		chars.add('C');
		for(char c : chars ) {
			System.out.println(c);
		}
		
		
		ArrayList <Fruits> list = new ArrayList<>();
		list.add(new Fruits("ばなな",50));
		list.add(new Fruits("いちご",500));
		list.add(new Fruits("りんご",100));
		for(Fruits f : list) {
			System.out.println(f);
		}
		list.add(0,new Fruits("キウイ",100)); //先頭に挿入 (index :0 new Fruits (" ",  )
		list.set(0,new Fruits("メロン",800)); //メロンで上書き
		if(list.isEmpty()) {
			System.out.println("リストは空です");  //if(変数.isEmpty())
		}
		Fruits fruits = new Fruits("メロン",800);
		if(list.contains(fruits)) {
			System.out.println("含んでいます");
		}
		System.out.println(list.indexOf(fruits)); //0
		Fruits removed = list.remove(0);
		System.out.println(removed);
		list.clear();
		System.out.println(list.size()); //0
		
		List<String> sushi = new LinkedList<>(); //LinkedList
		sushi.add("まぐろ");
		sushi.add("えび");
		sushi.add("さーもん");
		sushi.add("うに");
		sushi.add("まぐろ");
		sushi.add("えび");
		sushi.add("いくら");
		sushi.add("はまち");
		sushi.add("ほたて");
		System.out.println(sushi.size());
		for(String s:sushi) {
			System.out.println(s);
		}
	}
}

class Fruits{
	String name;
	int price;
	Fruits(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("フルーツ名：%s,価格：%d",this.name, this.price);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		return Objects.equals(name, other.name) && price == other.price;
		
		
/*
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Fruits) {
			Fruits f = (Fruits)obj;
			if(f.name.equals(this.name) && f.price == this.price) {
				return true;
			}
		}
		return false;
	}
*/
	}
}
