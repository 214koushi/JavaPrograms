package String;

public class ReversethewordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="I am from Testyantra";
        String[] s1 = s.split(" ");
        for (int i = 0; i <s1.length; i++) {
			String str=s1[i];
			for (int j = str.length()-1; j >=0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
