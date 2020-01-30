package model;

import java.util.*;

public class ConvertStringToIntegerList {

	public static List<Integer> conterStringToInteger(List<String> from) {
		List<Integer> to = new ArrayList<>();
		from.stream().forEach(i -> {
			to.add(Integer.parseInt(i));
		});
		return to;
	}

}
