package model;

import java.util.*;
import java.util.stream.*;

public class Prize {

	private HashMap<Integer, Integer> prizeMap;
	private HashMap<Integer, Integer> resultHashMap;

	private final int THREE_MATCH_PRIZE = 5000;
	private final int FOUR_MATCH_PRIZE = 50000;
	private final int FIVE_MATCH_PRIZE = 1500000;
	private final int SIX_MATCH_PRIZE = 2000000000;

	private static int sum = 0;

	public Prize(HashMap<Integer, Integer> resultHashMap) {
		prizeMap = new HashMap<>();
		prizeMap.put(3, THREE_MATCH_PRIZE);
		prizeMap.put(4, FOUR_MATCH_PRIZE);
		prizeMap.put(5, FIVE_MATCH_PRIZE);
		prizeMap.put(6, SIX_MATCH_PRIZE);

		this.resultHashMap = resultHashMap;
	}

	public HashMap<Integer, Integer> getPrizeMap() {
		return prizeMap;
	}

	public int getPrize() {
		IntStream.range(3, prizeMap.size() + 3).forEach(i -> {
			sum += prizeMap.get(i) * resultHashMap.get(i);
		});
		return sum;
	}

}
