package figurs;

import java.util.Random;
import java.util.Scanner;

public class Start {
    
    private Matrix matrix;
 
    public void startPO(Scanner sc) {
        boolean exit = false;
        System.out.println("���������� ������� �������");
        int m;
        int n;
        Random r = new Random();
        matrix = new Matrix(m = menuvvoda("������� ���������� �����", sc), n = menuvvoda("������� ���������� ��������", sc));
        for(int i = 0; i < m; i++) {
            		for(int j = 0; j < n; j++) {
            			matrix.put(i, j, r.nextInt(10));
            		}
            	}
        while (!exit) {
            programMenu();
            int menuinput = sc.nextInt();
            if (menuinput == 1) {
            	
                matrix.put(menuvvoda("������� ������", sc), menuvvoda("������� �������", sc), menuvvoda("��������", sc));
            } else if (menuinput == 2) {
                matrix.get(menuvvoda("������� ������", sc), menuvvoda("������� �������", sc));
            } else if (menuinput == 3) {
                System.out.println(this.matrix.toString());
            } else if (menuinput == 4) {
                System.out.println("���������� �����, ���������� �������� = " + this.matrix.elempoiskStrok(menuvvoda("������� ������ ������� ������",sc), menuvvoda("������� ������ ������� ������", sc)));
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
                "�������� ����� ����:" + "\n"
                        + "1. �������� ������� � �������" + "\n"
                        + "2. �������� ������� �� ���������" + "\n"
                        + "3. ������� �� ������  �������" + "\n"
                        + "4. ��������� ���������� ����������� 1, � 2" + "\n"
                        + "5. exit" + "\n"
 
        );
    }

}
