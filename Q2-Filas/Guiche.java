package u12parte2;

import java.util.Scanner;

public class Guiche {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Paciente paciente = new Paciente();
		Fila fila = new Fila();
		FilaPreferencial filaPreferencial = new FilaPreferencial();
		FilaMedico filaMedico = new FilaMedico();
		
		System.out.println("Retire o ticket: [1]Normal - [2]Prefencial - [3]Urgencia");
		int ticket = scanner.nextInt();
		if (ticket == 1) {
			paciente.senha = "normal";
			fila.inserirPaciente("cpf1");
		} else if (ticket == 2) {
			paciente.senha = "preferencial";
			filaPreferencial.inserirPreferencial("cpf2");
		} else if (ticket == 3) {
			paciente.senha = "urgencia";
			fila.inserirUrgencia("cpf3");
			filaMedico.inserirUrgencia("cpf3");
		} else {
			System.out.println("Tente novamente");
		}
		
		while (!fila.vazia()) {
			System.out.println(fila.retirarPaciente());
			System.out.println(filaPreferencial.retirarPreferencial());
		}
	}
}