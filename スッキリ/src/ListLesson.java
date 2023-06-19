import java.util.ArrayList;
import java.util.Objects;

public class ListLesson {

	public static void main(String[] args) {
		//動的な配列を扱う場合
		ArrayList<String> names = new ArrayList<String>(); //ArrayList<String> names = new ArrayList<>(); vr1.8は省略できる＜＞
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
		ArrayList <Integer> nums= new ArrayList<>();
		
		/*
		 * Wrapper Class(ラッパークラス)
		 * int -> Integer
		 * double -> Double
		 * boolean -> Boolean
		 * char -> Character
		 * */
		
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
	}
	
}

















