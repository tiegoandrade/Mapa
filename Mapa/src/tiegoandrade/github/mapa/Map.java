package tiegoandrade.github.mapa;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que mapeia chaves e valores e permite recuperar um valor com base em
 * uma chave.
 * 
 * @author Tiego
 *
 * @param <K> Tipo de dado das chaves.
 * @param <V> Tipo de dado dos valores.
 */
public class Map<K, V> {
	
	/** Lista com as chaves do mapa. */
	private List<K> keys = new ArrayList<K>();
	
	/** Lista com os valores do mapa. */
	private List<V> values = new ArrayList<V>();
	
	/**
	 * Insere um par de chave e valor a um mapa.
	 * 
	 * @param key Chave a ser inserida.
	 * @param value Valor a ser inserido.
	 * @return "True" se a chave não existia, "False" se a chave já existia.
	 */
	public boolean put(K key, V value) {
		
		// Se a chave passada como parâmetro já existia, é executado esse laço.
		if (keys.contains(key)) {
			
			/* 
			 * Atribui a uma variável a chave passada 
			 * como parâmetro que está no mapa.
			 */
			int index = getKeyIndex(key);
			
			// Pega essa chave e adiciona o novo valor passado no parâmetro.
			values.set(index, value);
			
			// Retorna "false", pois a chave já existia.
			return false;
		
		// Se a chave não existia, é executado esse laço.
		} else {
			
			// Adiciona a chave a lista de chaves.
			keys.add(key);
			
			// Adiciona o valor a lista de valores.
			values.add(value);
			
			// Retorna "true", pois a chave não existia.
			return true;
		}
	}
	
	/**
	 * Recupera o valor associado a uma chave.
	 * 
	 * @param key Chave usada para buscar um valor.
	 * @return Valor associado a uma chave.
	 */
	public V get(K key) {
		
		/* 
		 * Atribui a uma variável a chave passada 
		 * como parâmetro que está no mapa.
		 */
		int index = getKeyIndex(key);
		
		// Se a chave passada como parâmetro não existir, é retornado nulo.
		if (index < 0 ) {
			return null;
		}
		
		// Retorna o valor correspondente a chave passada como parâmetro.
		return values.get(index);
	}
	
	/**
	 * Retorna o índice da lista para uma chave passada como parâmetro.
	 * 
	 * @param key Chave que será procurada.
	 * @return Índice da lista que corresponde a chave.
	 */
	private int getKeyIndex(K key) {
		
		// Procura a chave em toda a lista.
		for (int i = 0; i < keys.size(); i++) {
			K k = keys.get(i);
			
			/* 
			 * Se o índice da lista é igual a chave passada como parâmetro,
			 * a chave é retornada.
			 */
			if (k.equals(key)) {
				return i;
			}
		}
		
		// Retornado se a chave não for encontrada.
		return -1;
	}
	
	/**
	 * Remove todas as chaves e os valores da lista.
	 */
	public void clear() {
		
		// Limpa a lista de chaves.
		keys.clear();
		
		// Limpa a lista de valores.
		values.clear();
	}
}
