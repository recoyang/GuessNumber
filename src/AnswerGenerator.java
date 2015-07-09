
public class AnswerGenerator {
	public static int[] generateRandomNumber(){
		int[] flag = new int[10];
		int[] randomNumber = new int[4];
		for (int i = 0; i < flag.length; i++) {
			flag[i] = 0;
		}
		
		for (int j = 0; j < randomNumber.length; j++) {
			int singleNumber;
		singleNumber = j>0?(int)(Math.random()*10):(int)((Math.random()*9)+1);
			if (flag[singleNumber] == 0) {
				randomNumber[j] = singleNumber;
				flag[singleNumber] = 1;
				continue;
			}
			j--;
		}
		return randomNumber;
	}
}
