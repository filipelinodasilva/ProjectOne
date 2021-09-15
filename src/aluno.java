
public class aluno {

	public static void main(String[] args) {

		int mediaAluno = 50;
		String nome = "Lino";
		
		// && se as duas condições for True, então True.
		if (mediaAluno >= 70 && nome.equals("Lino")) {
			System.out.println("Parabens vc está aprovado");
		} else if (mediaAluno < 70) {
			System.out.println(" vc esta reprovado");
		}
		System.out.println("Nome:" + nome);
	}
}
