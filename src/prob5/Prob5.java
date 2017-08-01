package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true) {
			randomGame();
			System.out.print("다시 하시겠습니까?(y/n)");
			if(scan.next().equals("n")) {
				break;
			}
		}
		scan.close();
	}

	private static void randomGame() {
		Scanner scan = new Scanner(System.in);
		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		int tryCount = 1;
		int inputNumber = 0;
		
		System.out.println("수를 결정하였습니다. 맞춰보세요.");
		while(true) {		
			System.out.printf("%d - %d\n", minNumber, maxNumber);
			System.out.printf("Try%d >> ", tryCount);
			inputNumber = scan.nextInt();
			
			if(inputNumber == correctNumber) {
				System.out.println("맞았습니다.");
				break;
			}
			else if( inputNumber < minNumber || maxNumber < inputNumber ) {
				System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
				continue;
			}
			else if(inputNumber < correctNumber) {
				System.out.println("더 높게");
				minNumber = inputNumber;
			}
			else if(inputNumber > correctNumber) {
				System.out.println("더 낮게");
				maxNumber = inputNumber;
			}
			
			tryCount++;
		}
		
		scan.close();
	}

}