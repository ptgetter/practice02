package prob4;
public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		if(str.isEmpty() == false)
		{
			char[] array = str.toCharArray();
			for(int i=0; i< array.length / 2; i++) {
				char temp = array[array.length-i-1];
				array[array.length-i-1] = array[i];
				array[i] = temp;
			}
			return array;
		}
		
		return null;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */	
		for(char c : array) {
			System.out.print(c);			
		}
		System.out.println();
	}
}
