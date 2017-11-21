package baseball;

public class BBgame_example2 {

	public static void main(String[] args) {
		BBgame bb = new BBgame();
		bb.compareNum();

		boolean run = true;
		int inputNum = 0;
		int strike;

		// BBgame 객체 색성
		BBGame_son bbgame = new BBGame_son();

		// 초기 출력문
		System.out.println("숫자야구 게임을 시작합니다.");

		// bbgame의 랜덤 메서드 호출
		bbgame.randomAnswer();

		// strike가 3이거나, out이 3일경우 반복문 종료
		while (run) {
			// bbgame의 출력문 호출
			bbgame.printFrist();

			// 입력받은 3자리 숫자를 inputNum에 저장
			inputNum = bbgame.scanAnswer();

			// bbgame의 판정 메서드를 호출, inputNum을 매개변수로 하며, 판정메서드의 strike반환 값을 strike에 저장
			strike = bbgame.bbJudgment(inputNum);

			// strike가 3일 경우 반복문 종료
			if (strike == 3) {
				System.out.println("정답~! 축하합니다~");
				run = false;
			}

			// out이 3일 경우 반복문 종료
			if (bbgame.out == 3) {
				System.out.println("게임오버");
				run = false;
			}

			// 매회 bbgame의 strike, ball 필드값을 0으로 초기화
			bbgame.strike = 0;
			bbgame.ball = 0;
		}

	}

}
