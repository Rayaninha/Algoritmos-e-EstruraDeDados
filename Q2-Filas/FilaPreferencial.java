package u12parte2;

public class FilaPreferencial {
	Paciente inicio;
	Paciente fim;
	
	int tamanho;
	
	FilaPreferencial() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}
	
	String verificaInicio() {
		if (inicio == null) {
			return null;
		}
		return inicio.cpf;
	}
	
	boolean vazia() {
		return tamanho == 0;
	}

	void inserirPreferencial(String cpf) {
		Paciente paciente = new Paciente();
		paciente.cpf = cpf;
		paciente.proximo = fim;
		fim = paciente;
		if (tamanho == 0) {
			inicio = paciente;
		}
		tamanho++;
	}
	
	String retirarPreferencial() {
		if (vazia()) {
			return null;
		}
		String cpf = inicio.cpf;
		if (tamanho == 1) {
			inicio = null;
			fim = null;
		} else {
			Paciente auxiliar = fim;
			while (auxiliar.proximo != inicio) {
				auxiliar = auxiliar.proximo;
			}
			inicio = auxiliar;
			inicio.proximo = null;
		}
		tamanho--;
		return cpf;
	}
}
