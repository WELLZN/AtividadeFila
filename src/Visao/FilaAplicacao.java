package Visao;
import javax.swing.JOptionPane;
import Modelagem.Fila;


public class FilaAplicacao {

	public static void main(String[] args) {
		   Fila FilaDeAlunos = new Fila();
	        
	        JOptionPane.showMessageDialog(null, "Fila de Alunos");
	        
	        FilaDeAlunos.incluirNaFila(JOptionPane.showInputDialog(null, "Digite o nome do aluno:"));
	        FilaDeAlunos.incluirNaFila(JOptionPane.showInputDialog(null, "Digite o nome do aluno:"));       
	        FilaDeAlunos.incluirNaFila(JOptionPane.showInputDialog(null, "Digite o nome do aluno:"));
	        
	        
	        JOptionPane.showMessageDialog(null, "Alunos na fila:\n" + FilaDeAlunos.mostrarFila());
	        
	        FilaDeAlunos.retirarFila();
	        
	        JOptionPane.showMessageDialog(null, "Alunos na fila:\n" + FilaDeAlunos.mostrarFila());
	        
	    }
	}

	
