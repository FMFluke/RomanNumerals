import java.util.ArrayList;

public class RomanNumerals {
	
	public int convertToInteger(String romanNum) throws RomanNumeralsInvalidFormatException {
		int i, res = 0, temp;
		if (!invalidDuplicateCheck(romanNum)) {
			throw new RomanNumeralsInvalidFormatException();
		}
		ArrayList<Integer> splited = splitGroup(romanNum);
		if (!invalidSubtractCheck(splited)) {
			throw new RomanNumeralsInvalidFormatException();
		}
		int lastindex = splited.size() - 1;
		int lastvalue = splited.get(lastindex);
		for (i=lastindex;i>=0;i--) {
			temp = splited.get(i);
			if (temp >= lastvalue) {
				res += temp;
			}
			else {
				res -= temp;
			}
		}
		return res;
	}
	
	private ArrayList<Integer> splitGroup(String romanNum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i, count=0;
		int current = getValue(romanNum.charAt(0));
		for (i=0;i<romanNum.length();i++) {
			if (current == getValue(romanNum.charAt(i))) {
				count++;
			}
			else {
				result.add(count*current);
				count = 1;
				current = getValue(romanNum.charAt(i));
			}
		}
		result.add(count*current); //last one
		return result;
	}
	
	private boolean invalidSubtractCheck(ArrayList<Integer> romanList) {
		int lastindex = romanList.size() - 1;
		int lastvalue = ((Integer) romanList.get(lastindex)).intValue();
		int i, temp;
		for (i=lastindex;i>=0;i--) {
			temp = romanList.get(i);
			if (i!=lastindex) {
				if (temp < lastvalue && (!isnotFive(temp))) {
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean invalidDuplicateCheck(String romanNum) {
		int lastindex = romanNum.length() - 1;
		char last = romanNum.charAt(lastindex);
		int i, count=1;
		for (i=lastindex-1;i>=0;i--) {
			if (romanNum.charAt(i)==last) {
				count += 1;
				if (!isnotFive(getValue(last)) || count > 3) {
					return false;
				}
			}
			else {
				count = 1;
			}
			
		}
		return true;
	}
	
	private boolean isnotFive(int c) {
		if (c == 1 || c == 10 || c == 100 || c == 1000) {
			return true;
		}
		return false;
	}
	
	private static int getValue(char a) {
		switch(a) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default: return 0;
		}
	}
}
