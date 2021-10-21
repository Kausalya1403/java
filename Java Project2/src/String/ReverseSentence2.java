package String;

public class ReverseSentence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "We are studying java concepts";
		System.out.println("My string is : " +str1);
		//using split function
		String[] words = str1.split(" ");
		int size=words.length;
		System.out.println(size+ " words are in my string");
		System.out.print("After reversing each word in a sentence is : ");
		for(int i =size-1;i>=0;i--) {
			System.out.print(words[i]+ " ");
		}
	}

}
