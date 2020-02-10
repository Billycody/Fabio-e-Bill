package poo;

import javax.swing.JOptionPane;

	public class poo {
		public static void main(String[]args	) {
			int n1,n2, somar;
			n1=Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro número:"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("digite o segundo número:"));
			somar=n1+n2;
			JOptionPane.showMessageDialog(null,("a soma dos números é:"+ somar));
			
		}
		}
