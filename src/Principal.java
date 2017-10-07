import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		JOptionPane.showMessageDialog(null, "O valor da soma é: " + (valor1 + valor2));
	}
}
