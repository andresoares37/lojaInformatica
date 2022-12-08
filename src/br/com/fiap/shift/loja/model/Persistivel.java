package br.com.fiap.shift.loja.model;

public interface Persistivel {
	
	public long getId();
	
	public Persistivel cadastrar(Persistivel p);
	
	public Persistivel consultarPorId(long id);
	
	public Persistivel alterar(Persistivel p);
	
	public boolean excluir(long id);

}
