package inputmas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int mas[] = new int[5];
		int i = 0;
		for(i = 0; i < mas.length; i ++) {
			System.out.println("input " + i + " number : ");
			mas[i] = Integer.valueOf(bf.readLine());
			}
		
			int product = 1;
		for(i = 0; i < mas.length; i ++) {
			if(mas[i]%2 == 0) {
			product = product * mas[i];
			}
			
		}
		System.out.println(product);
	}

}
