package Task2;

import java.util.Arrays;
//TODO Вторая задача
public class Main {
	public static void main(String[] args) {
           String [] array1 = {"тройка", "семёрка", "туз"};
	   System.out.println("Изначальный массив: " + String.join(",", array1));
	   Generic.change(array1, 0, 2);
	   System.out.println("Массив после обмена позиций двух элементов: " + String.join(",", array1));
	   Integer [] number1 = {1, 2, 3, 4, 5};
	   System.out.println("Изначальный массив: " + Arrays.toString(number1));
	   Generic.change(number1, 1, 4);
	   System.out.println("Массив после обмена позиций двух элементов: " + Arrays.toString(number1));
	}
}
