import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
	public static void main (String[] args) {

		String[][] array = {
			{"4","3","2","f"},
			{"4","3","2","0"},
			{"4","3","2","0"},
			{"4","3","2","6"}
		};
		
		try {
		System.out.println(SumMethod.sumMethod(array));
		} catch (MyArraySizeException e){
			System.out.println(e.message);
		} catch (MyArrayDataException e) {
			System.out.println(e.message);
		}
	}
}
 
class SumMethod {
	public static int sumMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {
		if(array.length !=4) throw new MyArraySizeException("Количество строк массива не равно 4");
 
		for(int i = 0; i < array.length; i++) {
			if(array[i].length != 4) throw new MyArraySizeException("Длина строки " + i + " не равна 4");
		}
 
		int sum = 0;
		int i = 0;
		int j = 0;
 
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array[i].length; j++) {
				try{
				sum+= Integer.parseInt(array[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException(i,j);
				}
			}
		}
		return sum;
	}
}
