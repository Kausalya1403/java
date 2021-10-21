package String;

public class ReverseaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is selenium course";
		System.out.println("input is :" +s);
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length-1;i>=0;i--) {
			result += (split[i] + " ");
		}
		System.out.println("The reversed sentence is : " +result.trim());
	}

}
