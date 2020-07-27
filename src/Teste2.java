public class Teste2 {

	public int[][] spiralMatrix(Integer d) {
		
		int[][] arr = new int[d.intValue()][d.intValue()];
//		preenchimento padrão
//		
//		for(int i = 1; i <= d*d; i++) {
//			if(i<=d){
//				arr[0][i-1] = i;
//			}else if(i%d != 0){
//				arr[i/d][i%d-1] = i;
//			}
//			else {
//				arr[i/d-1][d-1] = i;
//			}
//		}
		
		int i, k = 0, l = 0, m = d, n = d; 

		int num = 1;
        while (k < m && l < n) { 
            for (i = l; i < n; ++i) { 
                arr[k][i] = num; 
                num++;
            } 
            k++; 
  
            for (i = k; i < m; ++i) { 
                arr[i][n - 1] = num;
                num++;
            } 
            n--; 
  
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    arr[m - 1][i] = num;
                    num++;
                } 
                m--; 
            } 
  
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    arr[i][l] = num;
                    num++;
                } 
                l++; 
            } 
        } 
    
	return arr;
	} 
}
