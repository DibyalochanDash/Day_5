package Day_5;

public class CharacterPalindrome {

	public static void main(String[] args) {
		
		char [] ch = {'l','e','v','e','l','s'};
		int s = 0;
		int e = ch.length-1;
       
		boolean res =PalindromeChar(ch,s,e);
		System.out.println(res);
	}

	private static boolean PalindromeChar(char[] ch, int s, int e) {
		
		if (s >= e) {
            return true;
        }
		if (ch[s] == ch[e]) {
			boolean temp = PalindromeChar(ch,s+1,e-1);
			return true;
		}else {
			return false;
		}
	}

}
