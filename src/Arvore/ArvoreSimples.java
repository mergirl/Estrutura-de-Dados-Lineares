package Arvore;

import java.util.Iterator;

public class ArvoreSimples implements ArvoreGenerica {
	No raiz;
	int tamanho;
	
	public ArvoreSimples(Object o) {
		raiz = new No(null, o);
		tamanho = 1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
	
	@Override
	public int height(No v) {

	}

	@Override
	public Iterator nos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public No root() {
		return raiz;
	}

	@Override
	public No parent(No v) {
		return (v.parent());
	}

	@Override
	public Iterator children(No v) {
		return v.children();
	}

	@Override
	public boolean isInternal(No v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExternal(No v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoot(No v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int depth(No v) {
		int profundidade = profundidade(v);
		return profundidade;
	}

	private int profundidade(No v) {
		if (v == raiz)
			return 0;
		else
			return 1 + profundidade(v.parent());
	}

	@Override
	public Object replace(No v, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addChild(No v, Object o) {
		No novo = new No(v, o);
		v.addChild(novo);
		tamanho++;
	}

	@Override
	public Object remove(No v) throws InvalidNoException {
		No pai = v.parent();
		if (pai != null || isExternal(v))
			pai.removeChild(v);
		else
			throw new InvalidNoException("Impossível remover a raiz");
		Object o = v.element();
		tamanho--;
		return o;
	}
	
}
