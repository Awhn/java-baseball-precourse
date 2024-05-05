import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        while(true) {
            game();
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int stat = getInput(1,2);
            if(stat == 2) return;
        }

    }

    public static void game() {
        OppoCom oppoCom = new OppoCom();
        int[] hints;

        while(true) {
            System.out.printf("숫자를 입력해 주세요 : ");
            hints = oppoCom.checkNum(getInput(0, 999));
            if(hints[1] != 0) System.out.printf(hints[1] + "볼 ");
            if(hints[0] != 0) System.out.printf(hints[0] + "스트라이크");
            if(hints[2] == 3) System.out.printf("낫싱");
            System.out.println();
            if(hints[0] == 3) return;
        }

    }
    public static int getInput(int lowerBound, int upperBound) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input < lowerBound || input > upperBound) {
            throw new IllegalArgumentException("Out of range");
        }
        else return input;
    }
}
