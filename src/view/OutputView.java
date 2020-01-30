package view;

import model.LottoTickets;

import java.util.*;
import java.util.stream.*;

public class OutputView {

	public static void printHowManyTickets(int handMadeTicketNumber, int computerMadeTicketNumber) {
		System.out.println("수동으로 " + handMadeTicketNumber + "장, 자동으로 " + computerMadeTicketNumber + "개를 구매했습니다.");
	}

	public static void printLottoTicket(LottoTickets lottoTickets) {
		lottoTickets.getLottoTickets().forEach(i -> {
			System.out.println(i.getLottoNumbers());
		});
	}

	public static void printStatistics(HashMap<Integer, Integer> resultHashMap, HashMap<Integer, Integer> prizeMap) {
		System.out.println("당첨통계");
		System.out.println("==================");
		IntStream.range(3, resultHashMap.size() + 3).forEach(i -> {
			System.out.println(i + "개 일치 (" + prizeMap.get(i) + "원)- " + resultHashMap.get(i) + "개");
		});
	}

	public static void printYield(int purchaseLottoMoney, int prize) {
		System.out.println(String.format("총 수익률은 %.1f%%입니다.", ((float) prize / purchaseLottoMoney) * 100));
	}

}
