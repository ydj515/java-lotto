package model;

import java.util.*;
import java.util.stream.IntStream;

public class LottoTickets {

	private List<LottoTicket> lottoTickets;

	public LottoTickets(List<LottoTicket> handMadeLottoTickets, int computerMadeTicketNumber) {
		lottoTickets = new ArrayList<>();
		lottoTickets.addAll(handMadeLottoTickets);
		createLottoTickets(computerMadeTicketNumber);
	}

	private void createLottoTickets(int computerMadeTicketNumber) {
		IntStream.range(0, computerMadeTicketNumber).forEach(i -> {
			lottoTickets.add(new LottoTicket());
		});
	}

	public List<LottoTicket> getLottoTickets() {
		return lottoTickets;
	}
}
