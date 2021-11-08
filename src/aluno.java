import javax.swing.JOptionPane;

public class aluno {

	public static void main(String[] args) {

					
			String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
			String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
			System.out.println(carros);
			System.out.println(pessoas);
			
			double carroNumero = Double.parseDouble(carros);
			double pessoaNumero = Double.parseDouble(pessoas);
			
			int divisao = (int) (carroNumero / pessoaNumero);
			double resto = carroNumero % pessoaNumero;
			
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + "Carros e Sobrou " + resto + "Carros. ");
		}
	}


