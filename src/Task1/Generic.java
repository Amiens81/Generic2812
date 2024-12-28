package Task1;

public class Generic {
    public static <T> String arrayEqual(T [] array, T [] array2){
		if(array.length != array2.length){
			return "Массивы не содержат одинаковые элементы в одном и том же порядке! Длины массивов не равны!";
		}
		for(int i = 0; i < array.length; i++){
                if(!array[i].equals(array2[i])){
			return "Элементы в массивах различаются или не содержатся в одном и том же порядке!";
            }
		}
		return "Массивы содержат одинаковые элементы в одном и том же порядке";
    }
}
