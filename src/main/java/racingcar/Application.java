package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = readLine();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int attempts = Integer.parseInt(readLine());
        System.out.println();

        RacingGame game = new RacingGame(carNames.split(","),attempts);
        game.start();

        String winners = game.getWinners();
        System.out.println("최종 우승자 : " + winners);
    }
}
