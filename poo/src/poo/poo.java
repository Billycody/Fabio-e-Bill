package poo;

import javax.swing.JOptionPane;

	public class poo {
		public static void main(String[]args	) {
			int n1,n2, somar;
			n1=Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro n�mero:"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("digite o segundo n�mero:"));
			somar=n1+n2;
			JOptionPane.showMessageDialog(null,("a soma dos n�meros �:"+ somar));
			
		}
		}
