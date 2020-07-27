import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 2, 5, 4, 2, 3, 4 };
		int low = 1, high = 10;
		Teste1 teste = new Teste1();
		Integer[] arrayFinal8 = teste.missingNumbersJava8(arr, low, high);
		Integer[] arrayFinal = teste.missingNumbers(arr, low, high);
		
		System.out.println(Arrays.toString(arrayFinal8));
		System.out.println(Arrays.toString(arrayFinal));
		
		
		int dimensao = 4;
		Teste2 teste2 = new Teste2();
		int [][] spiralArray = teste2.spiralMatrix(dimensao);
		for(int i = 0; i < dimensao; i++) {
			System.out.println(Arrays.toString(spiralArray[i]));
		}	
	}
}
