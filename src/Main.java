import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree arvore = new Tree();
		Scanner read = new Scanner(System.in);
		
		arvore.exibir_arv();
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número para adicionar à arvore: ");
			int num = Integer.parseInt(read.nextLine());
			arvore.Inserir(new No(num));
		}
		arvore.exibir_arv();
	}

}
