package practice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda01 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.forEach(e -> System.out.println(e));// 람다식
	}

	public List<Integer> getOdds(List<Integer> list) {
		List<Integer> odds = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (i % 2 != 0) {
				odds.add(list.get(i));
			}
		}
		return odds;
	}

	public List<Integer> getOdds2(List<Integer> list) {
		return list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
	}
}
