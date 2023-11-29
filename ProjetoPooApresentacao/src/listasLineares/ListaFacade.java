package listasLineares;

public class ListaFacade {
	int value;
	Fila fila;
	ListaCircular listaCircular;
	ListaEncadeada listaEncadeada;
	
	/*
	 * @ListaFacade
	 * É responsável por inicializar todas as listas para
	 * em seguida poder executar a inserção ou remoção do valor
	 */
		public ListaFacade() {
		fila = new Fila(5);
		listaCircular = new ListaCircular();
		listaEncadeada = new ListaEncadeada();
	}
	public void InsertInLists() {
		fila.Inserir(value);
		listaCircular.Inserir(value);
		listaEncadeada.Inserir(value);
	}
	public void DeletInLists() {
		fila.Excluir(value);
		listaCircular.Excluir(value);
		listaEncadeada.Excluir(value);
	}
	
	
}
