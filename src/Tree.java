public class Tree {
	
	No raiz;
	
	public void Inserir(No valor) {
		raiz = InserirNo(raiz, valor);
	}
	
	private No InserirNo(No raiz, No elemento) {
		if(raiz == null) {
			raiz = elemento;
		}
		else if(elemento.valor_no < raiz.valor_no){
				raiz.esq = InserirNo(raiz.esq, elemento);
			}
		else if(elemento.valor_no > raiz.valor_no){
			
			raiz.dir = InserirNo(raiz.dir, elemento);
		}
		return raiz;
	}
	
	private boolean buscar_No_Met(No raiz, int elemento) {
		
		if(raiz == null) {
			return false;
		}
		else if (elemento == raiz.valor_no) {
			return true;
		}
		else if(elemento < raiz.valor_no) {
			return buscar_No_Met(raiz.esq, elemento);
		}
		else{
			return buscar_No_Met(raiz.dir, elemento);
		}
		
	}
	
	public boolean buscar_No(int elemento) {
		return buscar_No_Met(raiz, elemento);
		}
	
	public void exibir_arv() {
		exibir_arv_met(raiz);
	}
	
	private void exibir_arv_met(No raiz) {
		if (raiz != null) {
			exibir_arv_met(raiz.esq);
			System.out.print(raiz.valor_no + ", ");
			exibir_arv_met(raiz.dir);
		}
	}
	
	public void exibir_no(int elemento) {
		exibir_no(raiz, elemento);
	}
	
	private void exibir_no(No raiz, int elemento) {
		if (buscar_No(elemento)) {
			if (raiz.valor_no == elemento & raiz.esq == null & raiz.dir == null) {
				System.out.println("Você está numa folha");
			}
			else if (elemento == raiz.valor_no) {
				System.out.println(raiz.esq.valor_no + ","+ raiz.dir.valor_no);
			}
			else if(elemento < raiz.valor_no) {
				exibir_no(raiz.esq, elemento);
			}
			else if (elemento > raiz.valor_no){
				exibir_no(raiz.dir, elemento);
			}
			else {
				System.out.println("Erro");
			}
		}
		else {
			System.out.println("Elemento não econtrado");
		}
	}
	
	public void exibir_esq(int elemento) {
		exibir_esq(raiz,elemento);
	}
	
	private void exibir_esq(No raiz,int elemento) {
		if (buscar_No(elemento)) {
			if(raiz == null) {
				System.out.println("Elemento não encontrado");
			}
			else if (raiz.valor_no == elemento & raiz.esq == null) {
				System.out.println("Você está numa folha");
			}
			else if (elemento == raiz.valor_no) {
				System.out.println(raiz.esq.valor_no);;
			}
			else if(elemento < raiz.valor_no) {
				exibir_esq(raiz.esq, elemento);
			}
			else if (elemento > raiz.valor_no){
				exibir_esq(raiz.dir, elemento);
			}
			else {
				System.out.println("Erro");
			}
		}
		else {
			System.out.println("Elemento não econtrado");
		}
	}
	
	public void exibir_dir(int elemento) {
		exibir_dir(raiz, elemento);
	}
	
	private void exibir_dir(No raiz,int elemento) {
		if (buscar_No(elemento)) {
			if(raiz == null) {
				System.out.println("Elemento não encontrado");
			}
			else if (raiz.valor_no == elemento & raiz.dir == null) {
				System.out.println("Você está numa folha");
			}
			else if (elemento == raiz.valor_no) {
				System.out.println(raiz.dir.valor_no);
			}
			else if(elemento < raiz.valor_no) {
				exibir_dir(raiz.esq, elemento);
			}
			else if (elemento > raiz.valor_no){
				exibir_dir(raiz.dir, elemento);
			}
			else {
				System.out.println("Erro");
			}
		}
		else {
			System.out.println("Elemento não econtrado");
		}
	}
	/*
	private No rmv_met(int elemento) {
		
	}
	
	private No sucessor() {
		No subsNo;
	}
	
	private No predecessor() {
		No subsNo;
		
		return subsNo;
	}
	
	public void remover_No(No elemento) {
		
	}
	*/
}