package proGitHub;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = dados.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = dados.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("numero são multiplos");
		}else {
			System.out.println("numero não são multiplos");
		}
		
		dados.close();

	}

}