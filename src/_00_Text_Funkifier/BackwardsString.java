package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] temp = s.toCharArray();
		char[] backwords = new char[temp.length];
		for(int i = temp.length, j = 0; i > -1; i--, j++) {
			backwords[j] = temp[i];
		}
		
		return new String(backwords);
	}

}
