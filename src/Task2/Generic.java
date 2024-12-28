package Task2;

import java.util.Arrays;

public class Generic<T> {
	public static <T> void change(T [] array, int first, int second) {

		if (first < 0 || second < 0 || first >= array.length || second >= array.length) {
			throw new IllegalArgumentException("Данного индекса в массиве не существует!");
		}
		T temp = array[first];
		array[first] = array[second];
		array[second] = temp;

	}
}
