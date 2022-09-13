package Arrays;

public class Exercicio1VETOR {

	public static void main(String[] args) {
		
		//Exercício 1 - VETOR
		
		int A[] = {1,0,5,-2,-5,7};
		int x, somaA=0;
		
		for(x=0;x<6;x++) {
			somaA  = A[0]+A[1]+A[5];
			A[4]=100;
		}
		for(x=0;x<6;x++) {
			System.out.println(A[x]);
		}
		System.out.println("\nSomatório igual: "+somaA );
			
		

	}

}
