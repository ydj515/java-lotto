package view;

import java.util.*;

public class InputView {

	private static final Scanner scanner = new Scanner(System.in);

	public static int inputMoney() {
		System.out.println("구입금액을 입력해주세요.");
		return scanner.nextInt();
	}

	public static List<String> inputLastWeekWinningNumbers() {
		System.out.println("지난주 당첨 번호를 입력해주세요.");
		return new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));
	}

	public static int inputBonusBall() {
		System.out.println("보너스 볼을 입력해 주세요.");
		return scanner.nextInt();
	}

	public static int inputHandMadeLottoTicketsNumber() {
		System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
		return scanner.nextInt();
	}

	public static void inputHandMadeTicketMessage() {
		scanner.nextLine();
		System.out.println("수동으로 구매할 번호를 입력해 주세요.");
	}

	public static List<String> inputHandMadeTicket() {
		return new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")));
	}
}
