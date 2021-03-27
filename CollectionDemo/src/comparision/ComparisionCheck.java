package comparision;

public class ComparisionCheck {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1==str2) {
			System.out.println("both strings are equal");
		}
		
		System.out.println("str1 hash code : "+str1.hashCode());
		System.out.println("str2 hash code : "+str2.hashCode());

	}

}
