
public class aluno {

	public static void main(String[] args) {

		/*
		 * int mediaAluno = 50; String nome = "Lino";
		 * 
		 * // && se as duas condições for True, então True. if (mediaAluno >= 70 &&
		 * nome.equals("Lino")) { System.out.println("Parabens vc está aprovado"); }
		 * else if (mediaAluno < 70) { System.out.println(" vc esta reprovado"); }
		 * System.out.println("Nome:" + nome);
		 
		*/
		int nota1 = 10;
		int nota2 = 30;
		int nota3 = 40;
		int nota4 = 50;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*
		//Condições lógicas com IF e ELSE
		if (media >= 70) {
			System.out.println("Aluno Aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
			
		*/
		
		//Operadores ternários são para micro validações
		/*
		String saidaResultado = media >= 50 ? "Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(saidaResultado);
		*/
		
		// Switch Case: Operações Exatas
		
		switch (media) {
		case 70:
			System.out.println("Aluno aprovado: " + media);
			break;

		default: System.out.println("Aluno tem que refazer a prova: " + media);
			break;
		}
		
		
		
		}

	}

