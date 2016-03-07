package dragan.kec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SudokuGenerator {

	private Map<String, Integer> sudokuMap = new TreeMap<String, Integer>();
	
	// Map generator
	public Map<String, Integer> generateSudoku() {

		ArrayList<Integer> listNum = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			listNum.add(i);
		}
		Random randomNumber = new Random();
		int max = 9;		
		Collections.rotate(listNum, randomNumber.nextInt(max));
		
		for (int a = 0; a < 9; a++) {
			int b = 0;
			for (int i = 0; i < 9; i++) {
				sudokuMap.put(a + "." + i, listNum.get(b));
				b++;
			}
			if (a == 2 || a == 5) {
				Collections.rotate(listNum, 5);
			} else {
				Collections.rotate(listNum, 6);
			}
		}
		return sudokuMap;
	}
}
