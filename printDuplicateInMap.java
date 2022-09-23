package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class printDuplicateInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abbaba";
		char[] arr = input.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char maxOccur = input.charAt(0);
		int maxValue = 0;

		for (int i = 0; i < arr.length; i++) {

			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if (map.get(arr[i]) > maxValue) {
				maxOccur = arr[i];
				maxValue = map.get(arr[i]);
			}
		}
		System.out.println(maxOccur);
	}

	}


