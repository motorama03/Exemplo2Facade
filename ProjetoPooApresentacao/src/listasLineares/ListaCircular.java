package listasLineares;

import Interface.Listas;
import Nodo.Nodo;

public class ListaCircular implements Listas{

	private Nodo inicio;
	private Nodo fim;
	
	@Override
	public void Inserir(int dado) {
		Nodo novoNodoF = new Nodo(dado);
		if(inicio == null) {
			inicio = novoNodoF;
			inicio.setProx(inicio);
			fim = inicio;
		}else {
			fim.setProx(novoNodoF);
			novoNodoF.setDado(dado);
			novoNodoF.setProx(inicio);
			novoNodoF = fim;
		}
	}

	@Override
	public void Excluir(int dado) {
		if(inicio == null) return;
		if(inicio.getDado() == dado) {
			if(inicio == fim) {
				inicio = null;
				return;
			}
			// se elemento deletado for o primeiro
			// da lista, mas lista contém mais elementos
			inicio = inicio.getProx();
			fim.setProx(inicio);
			return;
		}
		// Caso o dado não for apagado ainda
		// o sistema procurará o dado no meio para
		// o final da lista
		Nodo aux = inicio;
		do{
			if(aux.getProx().getDado() == dado) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}while(aux!=inicio);
	}
	
	public int contaNodos() {
		Nodo aux = inicio;
		int counter = 0;
		if(inicio == null) return 0;
		else
			do {
				aux = aux.getProx();
				counter ++;
			}while(aux != inicio);
		return counter;
	}

	@Override
	public int Busca() {
		String lista = "";
		if(inicio == null)
			System.out.println(lista);
		
		Nodo aux = inicio;
		do{
			lista+= aux.getDado()+"\n";
			aux = aux.getProx();
		}while(aux!=inicio);
		System.out.println(lista);
		return 0;
	}	
}
