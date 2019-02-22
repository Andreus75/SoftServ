package figurs;

import java.util.Random;
import java.util.Scanner;

public class Start {
    
    private Matrix matrix;
 
    public void startPO(Scanner sc) {
        boolean exit = false;
        System.out.println("Необходимо создать матрицу");
        int m;
        int n;
        Random r = new Random();
        matrix = new Matrix(m = menuvvoda("Укажите количество строк", sc), n = menuvvoda("Укажите количество столбцов", sc));
        for(int i = 0; i < m; i++) {
            		for(int j = 0; j < n; j++) {
            			matrix.put(i, j, r.nextInt(10));
            		}
            	}
        while (!exit) {
            programMenu();
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
            	
                matrix.put(menuvvoda("Укажите строку", sc), menuvvoda("Укажите столбец", sc), menuvvoda("Значение", sc));
            } else if (menuinput == 2) {
                matrix.get(menuvvoda("Укажите строку", sc), menuvvoda("Укажите столбец", sc));
            } else if (menuinput == 3) {
                System.out.println(this.matrix.toString());
            } else if (menuinput == 4) {
                System.out.println("Количество строк, содержащих элементы = " + this.matrix.elempoiskStrok(menuvvoda("Укажите первый элемент поиска",sc), menuvvoda("Укажите второй элемент поиска", sc)));
            } else if (menuinput == 5) {
                exit = true;
 
            }
        }
    }
 
    private int menuvvoda(String command, Scanner sc) {
        System.out.println(command);
        return sc.nextInt();
    }
 
    private void programMenu() {
        System.out.println(
                "Выберете пункт меню:" + "\n"
                        + "1. Добавить элемент в матрицу" + "\n"
                        + "2. Получить элемент из координат" + "\n"
                        + "3. Вывести на печать  матрицу" + "\n"
                        + "4. Посчитать количество содержжащих 1, и 2" + "\n"
                        + "5. exit" + "\n"
 
        );
    }

}
