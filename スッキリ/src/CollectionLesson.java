import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionLesson {
	public static void main(String[] args) {
		Map<String,List<String>> data = new HashMap<>();
		
		List<String> tokyo = new ArrayList<>();
		tokyo.add("切子");
		tokyo.add("佃煮");
		tokyo.add("寿司");
		tokyo.add("のり");
		
		data.put("東京", tokyo);
		
		List<String> kyoto = new ArrayList<>();
		kyoto.add("織物");
		kyoto.add("人形");
		kyoto.add("漬物");
		kyoto.add("陶器");
		data.put("京都",kyoto); //kyoto は参照型
		
		for(String key : data.keySet()) {
			System.out.printf("%s:%s%n",key,data.get(key));
		}
		
		kyoto.add("八ツ橋");
		for(String key : data.keySet()) {
			System.out.printf("%s:%s%n",key,data.get(key));
		}
	}

}
