package Task1;
//TODO Первая зачада
public class Main {
	public static void main(String[] args) {
       String [] array1 = {"регион", "город", "район", "улица" };
	   String [] array2 = {"регион", "город", "район", "улица" };
	   String [] array3 = {"холодильник", "телевизор", "электропечка"};
	   String [] array4 = {"регион", "улица", "район", "город" };
		System.out.println("Сравнение строковых массивов");
	   System.out.println("Сравнение 1 и 2 массивов: " + Generic.arrayEqual(array1,array2));
	   System.out.println("Сравнение 1 и 3 массивов: " + Generic.arrayEqual(array1,array3));
	   System.out.println("Сравнение 1 и 4 массивов: " + Generic.arrayEqual(array1,array4));
	   System.out.println("Сравнение 2 и 3 массивов: " + Generic.arrayEqual(array2,array3));
	   System.out.println("Сравнение 2 и 4 массивов: " + Generic.arrayEqual(array2,array4));
	   System.out.println("Сравнение 3 и 4 массивов: " + Generic.arrayEqual(array3,array4));
	   Integer [] number1 = {1, 2, 3};
	   Integer [] number2 = {3, 4, 5, 6};
	   Integer [] number3 = {1, 2, 3};
	   Integer [] number4 = {3, 1, 2};
	   System.out.println("Сравнение числовых массивов");
	   System.out.println("Сравнение 1 и 2 массивов: " + Generic.arrayEqual(number1,number2));
	   System.out.println("Сравнение 1 и 3 массивов: " + Generic.arrayEqual(number1,number3));
	   System.out.println("Сравнение 1 и 4 массивов: " + Generic.arrayEqual(number1,number4));
	   System.out.println("Сравнение 2 и 3 массивов: " + Generic.arrayEqual(number2,number3));
	   System.out.println("Сравнение 2 и 4 массивов: " + Generic.arrayEqual(number2,number4));
	   System.out.println("Сравнение 3 и 4 массивов: " + Generic.arrayEqual(number3,number4));
	}
}