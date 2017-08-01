package prob3;

public class Prob3 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}

	private static void replaceSpace(char[] cArray) {
		// TODO Auto-generated method stub
		for(int i=0; i< cArray.length; i++) {
			if(cArray[i] == ' ') {
				cArray[i] = ',';
			}				
		}
	}

	private static void printCharArray(char[] cArray) {
		// TODO Auto-generated method stub
		for(char c : cArray) {
			System.out.print(c);			
		}
		System.out.println();
	}

}
