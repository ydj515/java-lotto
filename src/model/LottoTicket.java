package model;

import java.util.*;

public class LottoTicket {

	private RandomLottoNumberGenrator randomLottoNumberGenrator;
	private List<Integer> lottoNumbers;

	public LottoTicket() {
		randomLottoNumberGenrator = new RandomLottoNumberGenrator();
		createLottoTicket();
	}

	public LottoTicket(List<Integer> handlottoNumbers) {
		this.lottoNumbers = handlottoNumbers;
	}

	public List<Integer> getLottoNumbers() {
		return lottoNumbers;
	}

	private void createLottoTicket() {
		lottoNumbers = randomLottoNumberGenrator.createLottoNumbers();
	}
}
