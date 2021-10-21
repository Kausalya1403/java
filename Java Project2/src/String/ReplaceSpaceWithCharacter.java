package String;

public class ReplaceSpaceWithCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize string
String str = "Once in a blue moon";
char ch = '-';
System.out.println("String before replacing : " +str);
//Replace space with specific character ch, here ch is '-'
str = str.replace(' ', ch);

System.out.println("String after replacing spaces with given character :");
System.out.println(str);

	}

}
