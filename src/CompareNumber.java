
public class CompareNumber {
	 public static String compareNumbers(int[] number,int[] result){
		 int x = 0;
		 int y = 0;
		 for (int i = 0; i < number.length; i++) {
			if (number[i] == result[i]) {
				x++;
				continue;
			}
			for (int j = 0; j < result.length; j++) {
				if (number[j] == result[i]) {
					y++;
					break;
				}
			}
		}
		String resultString = x+"A"+y+"B";
		return resultString;
	 }
}
