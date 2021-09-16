
public class aluno {

	public static void main(String[] args) {

		/*
		 * int mediaAluno = 50; String nome = "Lino";
		 * 
		 * // && se as duas condições for True, então True. if (mediaAluno >= 70 &&
		 * nome.equals("Lino")) { System.out.println("Parabens vc está aprovado"); }
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
		 * //Condições lógicas com IF e ELSE if (media >= 70) {
		 * System.out.println("Aluno Aprovado: " + media); } else if (media >= 40 &&
		 * media <= 69) { System.out.println("Aluno em recuperação: " + media); } else {
		 * System.out.println("Aluno reprovado: " + media);
		 * 
		 */

		// Operadores ternários são para micro validações
		/*
		 * String saidaResultado = media >= 50 ? "Aluno Aprovado" : "Aluno Reprovado";
		 * System.out.println(saidaResultado);
		 */

		// Switch Case: Operações Exatas
		/*
		 * switch (media) { case 70: System.out.println("Aluno aprovado: " + media);
		 * break;
		 * 
		 * default: System.out.println("Aluno tem que refazer a prova: " + media);
		 * break; }
		 * 
		 * int dia = 4; switch (dia) { case 1: System.out.println("Domingo"); break;
		 * case 2: System.out.println("Segunda"); break; case 3:
		 * System.out.println("Terça"); break; case 4: System.out.println("Quarta");
		 * break;
		 * 
		 * default: System.out.println("Qualquer dia"); break; }
		 */

		/* Estrutura de repetição While */

		// int numero = 50;
		/*
		 * While valida se a condição é True, se for False ele finaliza a estrutura de
		 * repetição
		 */
		// Primeiro Verifica e depois Executa.
		// while (numero <= 55) {
		// System.out.println("O numero atual é : " + numero);
		// numero++;
		// }

		// int numero2 = 2;
		// do { /* Primeiro Executa e depois Verifica */

		// System.out.println("O numero atual é : " + numero2);
		// numero2++;

		// }
		// while (numero2 <= 5);

		/* Estrutura de repetição FOR Crescente e Decrescente */

		for (int idade = 0; idade <= 5; idade++) {
			System.out.println("Crescente : " + idade);
		}
		
		for (int anos = 5; anos >= 0; anos --) {
			System.out.println("Decrescente : " + anos);
		}

		/*********************************/
	}

}
