
public class aluno {

	public static void main(String[] args) {

		/*
		 * int mediaAluno = 50; String nome = "Lino";
		 * 
		 * // && se as duas condi��es for True, ent�o True. if (mediaAluno >= 70 &&
		 * nome.equals("Lino")) { System.out.println("Parabens vc est� aprovado"); }
		 * else if (mediaAluno < 70) { System.out.println(" vc esta reprovado"); }
		 * System.out.println("Nome:" + nome);
		 * 
		 */
		/*
		 * int nota1 = 10; int nota2 = 30; int nota3 = 40; int nota4 = 90; int media =
		 * 0;
		 * 
		 * media = (nota1 + nota2 + nota3 + nota4) / 4;
		 */
		/*
		 * //Condi��es l�gicas com IF e ELSE if (media >= 70) {
		 * System.out.println("Aluno Aprovado: " + media); } else if (media >= 40 &&
		 * media <= 69) { System.out.println("Aluno em recupera��o: " + media); } else {
		 * System.out.println("Aluno reprovado: " + media);
		 * 
		 */

		// Operadores tern�rios s�o para micro valida��es
		/*
		 * String saidaResultado = media >= 50 ? "Aluno Aprovado" : "Aluno Reprovado";
		 * System.out.println(saidaResultado);
		 */

		// Switch Case: Opera��es Exatas
		/*
		 * switch (media) { case 70: System.out.println("Aluno aprovado: " + media);
		 * break;
		 * 
		 * default: System.out.println("Aluno tem que refazer a prova: " + media);
		 * break; }
		 * 
		 * int dia = 4; switch (dia) { case 1: System.out.println("Domingo"); break;
		 * case 2: System.out.println("Segunda"); break; case 3:
		 * System.out.println("Ter�a"); break; case 4: System.out.println("Quarta");
		 * break;
		 * 
		 * default: System.out.println("Qualquer dia"); break; }
		 */

		/* Estrutura de repeti��o While */

		// int numero = 50;
		/*
		 * While valida se a condi��o � True, se for False ele finaliza a estrutura de
		 * repeti��o
		 */
		// Primeiro Verifica e depois Executa.
		// while (numero <= 55) {
		// System.out.println("O numero atual � : " + numero);
		// numero++;
		// }

		// int numero2 = 2;
		// do { /* Primeiro Executa e depois Verifica */

		// System.out.println("O numero atual � : " + numero2);
		// numero2++;

		// }
		// while (numero2 <= 5);

		/* Estrutura de repeti��o FOR Crescente e Decrescente */

		for (int idade = 0; idade <= 5; idade++) {
			System.out.println("Crescente : " + idade);
		}
		
		for (int anos = 5; anos >= 0; anos --) {
			System.out.println("Decrescente : " + anos);
		}

		/*********************************/
	}

}
