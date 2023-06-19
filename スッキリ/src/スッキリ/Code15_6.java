package スッキリ;

import java.util.Arrays;

public class Code15_6 {

	public static void main(String[] args) {
		String name ="N12A4567";
		//static method isValidPlayerName()
	    if(isValidPlayerName(name)) {
			System.out.println("ok");
		}else {
			System.out.println("ng");  //ok
		}
		String s = "Java";
		if(s.matches("Java")) { System.out.println("ok"); } //ok
		if(s.matches("JavaJava")) { System.out.println("ok"); } //ng
		if(s.matches("java")) { System.out.println("ok"); }  //ng
		if(s.matches("J.va")) { System.out.println("ok"); }  //ok
		s="Jaaaava";
		if(s.matches("Ja*va")) { System.out.println("ok"); } //ok
		s="あいうxx019";
		if(s.matches(".*")) { System.out.println("ok"); } //ok
		if(s.matches("あい.*")) { System.out.println("ok"); } //ok
		if(s.matches(".*9")) { System.out.println("ok"); } //ok
		s="146-0092";
		if(s.matches("[0-9]{3}-?[0-9]{4}")) { System.out.println("ok"); } //ok
		s="URI";
		if(s.matches("UR[LIN]")) { System.out.println("ok"); } //ok
		if(s.matches("[A-Z]{3}")) { System.out.println("ok"); } //ok
		if(s.matches("[A-Za-z0-9]{3}")) { System.out.println("ok"); } //ok
		s="abc,def:ghi";
		String[] words = s.split("[,:]");
		System.out.println(Arrays.toString(words)); //[abc, def, ghi]
		String w = s.replaceAll("[beh]","X");
		System.out.println(w);//aXc,dXf:gXi
		

	}
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
