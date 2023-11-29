package listasLineares;

import Interface.Listas;
import Nodo.Nodo;

public class Fila implements Listas{
	
	private Nodo inicio = null;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	/**
	 * Métodos usados interamente para a própria classe!
	 * @param limite
	 * @param tamanho
	 */
	public Fila(int limite) {
		this.limite = limite;
	}
	public boolean isPar(int iNumero) {
		return (iNumero % 2) == 0;
	}
	public boolean isImpar(int iNumero) {
		return (iNumero % 3) == 0;
	}
	public boolean estaVazio() {
		return tamanho == 0;
	}
	public boolean temEspaco() {
		return limite > tamanho;
	}
	public int getInicio() {
		if (!estaVazio()) {
			return inicio.getDado();
		}else {
			System.out.println("Fila está vazia");
			return -1;
		}
	}
	public Fila filtro(int iNumero, boolean bPar) {
		Nodo oNodoAtual = inicio;
		
		Fila oFila = new Fila(limite);
		
		while(oNodoAtual != fim) {	
			
			if(bPar && isPar(iNumero)) {
				oFila.Inserir(iNumero);
				System.out.println(iNumero);
			}
			else {
				oFila.Inserir(iNumero);
			}
			
			oNodoAtual = oNodoAtual.getProx();
		}
		
		return oFila;
	}
	
	@Override
	public void Excluir(int dado) {
		if(estaVazio()) {
			return;
		}
		inicio = inicio.getProx();
		tamanho--;
		if(estaVazio()) {
			fim = null;
		}
		return;
	}	

	@Override
	public int Busca() {
		return 1;
	}

	@Override
	public void Inserir(int dado) {
		if(temEspaco()) {
			Nodo novo = new Nodo(dado);
			if(estaVazio()) {
				inicio = novo;
				fim = novo;
			}else {
				fim.setProx(novo);
				fim = novo;
			}
		tamanho++;
	}else
		System.out.println("Fila cheia");
	}
}
