package Modelagem;

public class Fila {
		 
	    int inicio;
	    int fim;
	    int tamanho;
	    int QtdAlunos;
	    String F[];
	    String nome;
	    
	    public Fila() {
	        inicio = fim = -1;
	        tamanho = 4;
	        F = new String[tamanho];
	        QtdAlunos = 0;
	    }
	    
	    public boolean estaVazia() {
	        return QtdAlunos == 0;
	    }
	    
	    public boolean estaCheia() {
	        return QtdAlunos == tamanho - 1;
	    }
	    
	    public void incluirNaFila(String e) {
	        if (!estaCheia()) {
	            if (inicio == -1) {
	                inicio = 0;
	            }
	            fim++;
	            F[fim] = e;
	            QtdAlunos++;
	        }
	    }
	    
	    public String mostrarFila() {
	        String pessoas = "";
	        for (int i = inicio; i <= fim; i++) {
	            pessoas += F[i] + "\n";
	        }
	        return pessoas;
	    }
	    
	    public void retirarFila() {
	        if (!estaVazia()) {
	            inicio++;
	            QtdAlunos--;
	        }
	    }
	}



