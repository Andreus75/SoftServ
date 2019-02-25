package figurs;

public class Matrix {

	    private int[][] matrixTable;
	 
	    public Matrix(int m, int n) {
	        this.matrixTable = new int[m][n];
	    }
	 
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
	 
// перевірка чи не виходить елемент за розміри матриці

	     private void indexOfbound(int x, int y){
	        if (x >= this.matrixTable.length || y >= this.matrixTable[x].length) {
	            throw new IndexOutOfBoundsException("ви за границьою масива");
	        }
	        
	}
	     
//	    метод пошуку кількості рядків , в яких попадаються одночасно два числа
	
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

