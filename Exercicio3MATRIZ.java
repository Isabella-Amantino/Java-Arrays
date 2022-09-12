package Arrays;

import java.util.Scanner;

public class Exercicio3MATRIZ {

	public static void main(String[] args) {
		
		// Exercício 3 - MATRIZ
		
		int[][] num = new int [3][3];
		int x,y,cont10=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				
				System.out.println("\nEntre com um número: ");
				num[x][y] = leia.nextInt();
				
				if(num[x][y] >  10) {
					cont10++;
				}
			}
		}
		System.out.println("\nA quantidade de números maiores que 10 são: "+cont10);
	}

}
