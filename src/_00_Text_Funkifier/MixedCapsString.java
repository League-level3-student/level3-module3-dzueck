package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String returnThis = s;
		for(int i = 0; i < returnThis.length(); i++) {
			if(i%2 == 1) {
				if(i == s.length() - 1) {
					returnThis = returnThis.substring(0, i) + returnThis.substring(i,i + 1).toUpperCase();
				}
				else {
					returnThis = returnThis.substring(0, i) + returnThis.substring(i,i + 1).toUpperCase() + returnThis.substring(i + 1);
				}
			}
			else {
				if(i == 0) {
					returnThis = returnThis.substring(0, 1).toLowerCase() + returnThis.substring(1);
				}
				else if(i == s.length() - 1) {
					returnThis = returnThis.substring(0, i) + returnThis.substring(i,i + 1).toLowerCase();
				}
				else {
					returnThis = returnThis.substring(0, i) + returnThis.substring(i,i + 1).toLowerCase() + returnThis.substring(i + 1);
				}
			}
		}
		
		return returnThis;
	}

}
