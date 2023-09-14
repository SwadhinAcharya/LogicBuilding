 package logicBuilding;
//Count a number of words in a given String and all three words 
public class Question2 {
	public static void main(String[] args) {
		String str = "pankaj sir academy";
		String[] s = str.trim().split(" ");
		System.out.println(s.length);
		System.out.print("all three words are : \n");
		for (String x : s) {
		     	System.out.print(x);
		     	System.out.print(" \n");
		}
		
			}

}
