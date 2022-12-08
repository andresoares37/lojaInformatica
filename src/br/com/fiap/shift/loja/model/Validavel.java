package br.com.fiap.shift.loja.model;
@FunctionalInterface
public interface Validavel<T> {
	
	public boolean validar(T t);
}
