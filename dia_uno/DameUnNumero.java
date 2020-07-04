import javax.swing.JOptionPane;

public class DameUnNumero {
	public DameUnNumero(){
		System.out.println("Constructor Iniciado");
	}
	public void pedirNumero(){
		String num = JOptionPane.showInputDialog("Numero por favor: ");
	}
	public static void main(String[] args) {
		DameUnNumero dn = new DameUnNumero();
		dn.pedirNumero();
	}
}

