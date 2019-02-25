package figurs;

import java.util.Random;
import java.util.Scanner;

public class Start {
    
    private Matrix matrix;
 
    public void startPO(Scanner sc) {
        boolean exit = false;
        System.out.println("Створюєм матрицю");
        int m;
        int n;
        Random r = new Random();
        matrix = new Matrix(m = menuvvoda("Вкажіть кількість рядків", sc), n = menuvvoda("Вкажіть кількість колонок", sc));
        for(int i = 0; i < m; i++) {
            		for(int j = 0; j < n; j++) {
            			matrix.put(i, j, r.nextInt(10));
            		}
            	}
        while (!exit) {
            programMenu();
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
            	
                matrix.put(menuvvoda("Вкажіть рядок", sc), menuvvoda("Вкажіть колонку", sc), menuvvoda("Значення", sc));
            } else if (menuinput == 2) {
                matrix.get(menuvvoda("Вкажіть рядок", sc), menuvvoda("Вкажіть колонку", sc));
            } else if (menuinput == 3) {
                System.out.println(this.matrix.toString());
            } else if (menuinput == 4) {
                System.out.println("Кількість рядків = " + this.matrix.elempoiskStrok(menuvvoda("Вкажіть перший елемент пошуку",sc), menuvvoda("Вкажіть другий елемент пошуку", sc)));
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
                "Виберіть пункт меню:" + "\n"
                        + "1. Добавити елемент в матрицю" + "\n"
                        + "2. Отримати елемент з матриці" + "\n"
                        + "3. Подивитись матрицю" + "\n"
                        + "4. Порахувати кількісь, що містить 1, і 2" + "\n"
                        + "5. exit" + "\n"
 
        );
    }

}
