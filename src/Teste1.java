import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste1 {

	public Integer[] missingNumbersJava8(int[] arr, int low, int high) {
		List<Integer> lista = Stream.iterate(low, n -> n + 1).limit(high).collect(Collectors.toList());
		lista.removeAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		return lista.toArray(new Integer[0]);
	};

	public Integer[] missingNumbers(int[] arr, int low, int high) {
		List<Integer> listaCompleta = new ArrayList<Integer>();
		for (int i = low; i <= high; i++) {
			listaCompleta.add(i);
		}

		List<Integer> lista = new ArrayList<Integer>();
		lista.addAll(listaCompleta);
		for (int j = 0; j <= arr.length - 1; j++) {
			int arrObj = arr[j];
			for (Integer n : listaCompleta) {
				if (n.equals(arrObj)) {
					lista.remove(n);
				}
			}
		}
		return lista.toArray(new Integer[0]);
	}
}
