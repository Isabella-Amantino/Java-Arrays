package Arrays;

import java.util.Scanner;

public class Exercicio4MATRIZ {

	public static void main(String[] args) {
		
		//Exercício 4 - MATRIZ
		
		float[][] m1 = new float [2][2]; 
		float[][] m2 = new float [2][2];
		float[][] m3 = new float [2][2];
		int valor,x,y,op;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<2;x++) {
			for(y=0;y<2;y++) {
				System.out.println("\nEntre com os valores da matriz 1: ");
				m1[x][y] = leia.nextFloat();
			}
		}
		for(x=0;x<2;x++) {
			for(y=0;y<2;y++) {
				System.out.println("\nEntre com os valores da matriz 2: ");
				m2[x][y] = leia.nextFloat();
			}
		}
		
		do {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1- Somar as matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda");
			System.out.println("\n3- Adicionar uma constante as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Sair do programa");
			System.out.println("\nDigite sua opção:  ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						
						m3[x][y] = m1[x][y] + m2[x][y];
						System.out.println("\nSoma: "+m3[x][y]);
						}
				}
				break;
			case 2:
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						m3[x][y] = m2[x][y] - m1[x][y];
						System.out.println("\nDiferença: " +m3[x][y]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com um valor: ");
				valor = leia.nextInt();
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						m1[x][y] += valor;
						m2[x][y] += valor;
						System.out.println("\nMatriz1: "+m1[x][y]);
						System.out.println("\nMatriz2: "+m2[x][y]);
					}
				}
				break;
			case 4:
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						System.out.println("\nMatriz1: "+m1[x][y]);
					}
				}
				for(x=0;x<2;x++) {
					for(y=0;y<2;y++) {
						System.out.println("\nMatriz2: "+m2[x][y]);
					}
				}
				break;
			case 0:
				System.out.println("\nObrigado por utilizar o nosso programa!");
				break;
			default:
				System.out.println("\nOpção inválida");
			}
		}while(op!=0);
	}

}
