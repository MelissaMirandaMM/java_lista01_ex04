package pacQuestao04;

import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		int linhas = 4;
		int colunas = 4;
		int matriz[][] = new int[linhas][colunas];
		int codigoDoCurso=0;
		
		preencheMatriz(matriz);
		escreveNaTela(matriz);
		premiacao(matriz,codigoDoCurso);
	
	}
	
	public static void escreveNaTela(int m[][]) {
		for (int i = 0; i<m.length; i++) {
			for (int j = 0; j<m[i].length;j++) {
				System.out.print(m[i][j]+ ",");
			}
			System.out.println();
		}
	}
	public static void preencheMatriz(int m[][]) {
		Scanner leitura = new Scanner(System.in);
		for (int i = 0; i<m.length; i++) {
			System.out.println("Informe a matricula do aluno: ");
			int matricula = leitura.nextInt();
			m[i][0]=matricula;
			
			System.out.println("Informe o gênero do discente (0 = F  |  M = 1) : ");
			int sexo = leitura.nextInt();
			m[i][1] = sexo;
			
			System.out.println("Informe o curso do aluno: ");
			int curso = leitura.nextInt();
			m[i][2] = curso;
			
			System.out.println("Informe o CR: ");
			int cr = leitura.nextInt();
			m[i][3]=cr;
		}
	}
	public static void premiacao(int m[][], int codigoDoCurso) {
		int crMaisAlto = 0;
		int matriculaDaAluna = -1;
		for (int i = 0; i <m.length; i++) {
			if(m[i][1]==0 && m[i][2]== codigoDoCurso && m[i][3] > crMaisAlto) {
				matriculaDaAluna = m[i][0];
				crMaisAlto = m[i][3];
			}
		}
		System.out.println("A aluna premiada é: "+ matriculaDaAluna);
	}
	
}