package controller;

import model.ConvertStringToIntegerList;
import model.LottoTicket;
import model.LottoTickets;
import model.Prize;
import model.Result;
import view.InputView;
import view.OutputView;

import java.util.*;
import java.util.stream.*;

public class LottoController {

	private static final int LOTTO_TICKET_PRICE = 1000;

	public void run() {

		// 구매금액
		int purchaseLottoMoney = InputView.inputMoney();
		int totalTicketNumber = purchaseLottoMoney / LOTTO_TICKET_PRICE;

		// 수동으로 구매할 티켓 갯수
		int handMadeTicketNumber = InputView.inputHandMadeLottoTicketsNumber();

		// 자동으로 구매할 티켓 갯수
		int computerMadeTicketNumber = totalTicketNumber - handMadeTicketNumber;

		List<LottoTicket> handMadeLottoTickets = new ArrayList<>();

		// 수동으로 구매하는 티켓 입력
		InputView.inputHandMadeTicketMessage();

		IntStream.range(0, handMadeTicketNumber).forEach(i -> {
			handMadeLottoTickets.add(new LottoTicket(ConvertStringToIntegerList.conterStringToInteger(InputView.inputHandMadeTicket())));
		});

		// ~개를 구매했습니다
		OutputView.printHowManyTickets(handMadeTicketNumber, computerMadeTicketNumber);

		LottoTickets lottoTickets = new LottoTickets(handMadeLottoTickets, computerMadeTicketNumber);

		// 구매 로또 티켓들
		OutputView.printLottoTicket(lottoTickets);

		// 지난주 당첨번호 입력
		List<Integer> lastWeekWinngNumbers = ConvertStringToIntegerList.conterStringToInteger(InputView.inputLastWeekWinningNumbers());

		// 보너스볼 추가
		lastWeekWinngNumbers.add(InputView.inputBonusBall());

		Result result = new Result(lottoTickets, lastWeekWinngNumbers);
		Prize prize = new Prize(result.getResult());

		// 당첨 통계
		OutputView.printStatistics(result.getResult(), prize.getPrizeMap());

		// 수익률
		OutputView.printYield(purchaseLottoMoney, prize.getPrize());
	}

}
