package figurs;

public class Matrix {

	    private int[][] matrixTable;
	 
	    // конструктор задает размерность матрицы
	    public Matrix(int m, int n) {
	        this.matrixTable = new int[m][n];
	    }
	 
	    // получить элемент матрицы в x- строке , в y-столбце
	    public int get(int x, int y) {
	        indexOfbound(x, y);
	        return this.matrixTable[x][y];
	    }
	 
	    public void put(int x, int y, int value) {
	        indexOfbound(x, y);
	        this.matrixTable[x][y] = value;
	    }
	 
	    @Override
	    public String toString() {
	        String result = "";
	        for (int[] k : this.matrixTable) {
	            result = result + "\n";
	            for (int res : k) {
	                result = result + "  " + res + "  ";
	            }
	        }
	        return result;
	    }
	 
	    /**
	     * проверка на выход за пределы массива
	     * 
	     * @param x
	     * @param y
	     */
	     private void indexOfbound(int x, int y){
	        if (x >= this.matrixTable.length || y >= this.matrixTable[x].length) {
	            throw new IndexOutOfBoundsException("вы вывалились за пределы массива , думайте что пишите");
	        }
	        
	}
	    /**
	     * метод поиска количества строк , в которых попадаются одновременно два числа
	     *
	     * @return
	     */
	    public int elempoiskStrok(int value1, int value2) {
	        int res = 0;
	        for (int i = 0; i < this.matrixTable.length; i++) {
	            boolean modifOne = false;
	            boolean modifTwo = false;
	            for (int j = 0; j < this.matrixTable[i].length; j++) {
	                if (value1 == this.matrixTable[i][j]) {
	                    modifOne = true;
	                }
	                if (value2 == this.matrixTable[i][j]) {
	                    modifTwo = true;
	                }
	                if (modifOne && modifTwo) {
	                    res = res + 1;
	                    break;
	                }
	 
	            }
	        }
	        return res;
	    }
}

