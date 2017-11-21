package baseball;

import java.util.Scanner;

public class BBGame_son {

	// 필드
	private static int[] bbAnswer; // 정답을 저장할 배열
	int out = 0;
	int strike = 0;
	int ball = 0;

	// 생성자
	BBGame_son() {
		// 정답을 저장할 배열을 객체화
		bbAnswer = new int[3];
	}

	// 답체크 메서드
	public static int[] get() {
		int[] num = new int[bbAnswer.length];
		num = bbAnswer;
		return num;
	}

	// 정답 생성 메서드
	public static void randomAnswer() {
		// 정답을 임시로 저장할 배열
		int[] answerTemp = new int[bbAnswer.length];
		boolean run = true;
		int cnt = 0;

		// 답에 중복이 안생길때까지 반복
		while (run) {
			// 랜덤으로 숫자를 생성해서 배열에 넣는 반복문
			for (int i = 0; i < answerTemp.length; i++) {
				answerTemp[i] = (int) (Math.random() * 10);
			}

			// cnt는 0으로 초기화 상태, 중복을 체크
			for (int i = 0; i < answerTemp.length; i++) {
				for (int j = i + 1; j < 3; j++) {
					if (answerTemp[i] == answerTemp[j]) {
						cnt++;
					}
				}
			}

			// cnt가 0이 아닌 다른 숫자의 경우 위의 반복문을 계속 실행, 0이면 중복 제거완료 판단 빠져나옴
			if (cnt == 0) {
				System.out.println("정답 : " + answerTemp[0] + answerTemp[1] + answerTemp[2]);
				bbAnswer = answerTemp;
				run = false;
			}

			// cnt를 0으로 초기화
			cnt = 0;
		}
	}

	// 입력 받는 문구 출력 메서드
	public static void printFrist() {
		System.out.println("숫자를 입력하세요.");
		System.out.print("입력 > ");
	}

	// 숫자 입력 받는 메서드
	public static int scanAnswer() {
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;
		inputNum = scan.nextInt();
		return inputNum;
	}

	// 판정 메서드
	public int bbJudgment(int answer) {
		// 입력받은 세자리 숫자를 저장할 배열
		int[] answerTemp = new int[bbAnswer.length];

		// 입력받은 세자리 숫자 나눠서 배열에 저장
		for (int i = 0; i < answerTemp.length; i++) {
			switch (i) {
			case 0:
				answerTemp[0] = answer / 100;
				break;
			case 1:
				answerTemp[1] = (answer / 10) % 10;
				break;
			case 2:
				answerTemp[2] = answer % 10;
				break;
			}
		}

		// 스트라이크, 볼, 아웃 판정
		for (int i = 0; i < answerTemp.length; i++) {
			// 같은 위치에 같은 숫자일 경우
			if (bbAnswer[i] == answerTemp[i]) {
				strike++;
			}
			for (int j = 0; j < answerTemp.length; j++) {
				// 다른위치에
				if (i != j) {
					// 같은 숫자일 경우
					if (bbAnswer[i] == answerTemp[j]) {
						ball++;
					}
				}
			}
		}

		// 아웃 판정
		if ((strike == 0) && (ball == 0)) {
			out++;
		}

		// 결과 출력
		System.out.println(strike + "스트라이크 " + ball + "볼 " + out + "아웃");

		// 스트라이크 값 리턴
		return strike;
	}
}
