package Arrays;

import java.util.Scanner;

public class Exercicio2VETOR {

	public static void main(String[] args) {
		
		//Exercício 2 - VETOR
		
		int[] num = new int[6];
		int[] par = new int[6];
		int[] impar = new int [6];
		int x,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com um número: ");
			num[x] = leia.nextInt();
			
			if(num[x] % 2 == 0) {
				par[x] = num[x];
				somaPar += par[x];
			}else {
				impar[x] = num[x];
				contImpar++;
			}
		}
		
		System.out.print("\nOs números pares são: ");
		for(x=0;x<6;x++) {
			System.out.print(" [ " + par[x]+" ] ");
		}
		System.out.println("\nSomatória dos números pares: "+somaPar);
		
		System.out.print("\nOs números ímpares são: ");
		for(x=0;x<6;x++) {
			System.out.print(" [ "+impar[x]+" ] ");
		}
		System.out.println("\nQuantidade de números ímpares: "+contImpar);
	}

}
