
public class aluno {

	public static void main(String[] args) {

		int mediaAluno = 50;
		String nome = "Alex";
		
		// && se as duas condi��es for True, ent�o True.
		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabens vc est� aprovado");
		} else if (mediaAluno < 70) {
			System.out.println(" vc esta reprovado");
		}
		System.out.println("Nome:" + nome);
	}
}
