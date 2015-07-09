
public class CompareNumber {
	 public static String compareNumbers(int[] number,int[] answer){
		 int numberOfSameValueAndPositon = 0;
		 int numberOfSameValue = 0;
		 
		 int[] flag = new int[10];
		 for (int i = 0; i < flag.length; i++) {
			flag[i] = 0;
		}
		 
		 for (int i = 0; i < answer.length; i++) {
			 int singleNumberOfAnswer = answer[i];
			 flag[singleNumberOfAnswer]++;
			 numberOfSameValue = flag[singleNumberOfAnswer] == 2?numberOfSameValue+1:numberOfSameValue;
			
			 int singleNumberOfUser = number[i];
			 flag[singleNumberOfUser]++;
			 numberOfSameValue = flag[singleNumberOfUser] == 2?numberOfSameValue+1:numberOfSameValue;
		}
		 
		 for (int i = 0; i < number.length; i++) {
			if (number[i] == answer[i]) {
				numberOfSameValueAndPositon++;
				//continue;
			}
//			for (int j = 0; j < answer.length; j++) {
//				if (number[j] == answer[i]) {
//					numberOfSameValue++;
//					break;
//				}
//			}
		}
		 numberOfSameValue = numberOfSameValue - numberOfSameValueAndPositon;
		String resultString = numberOfSameValueAndPositon+"A"+numberOfSameValue+"B";
		return resultString;
	 }
}
