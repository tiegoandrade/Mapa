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
	 * @return "True" se a chave n�o existia, "False" se a chave j� existia.
	 */
	public boolean put(K key, V value) {
		
		// Se a chave passada como par�metro j� existia, � executado esse la�o.
		if (keys.contains(key)) {
			
			/* 
			 * Atribui a uma vari�vel a chave passada 
			 * como par�metro que est� no mapa.
			 */
			int index = getKeyIndex(key);
			
			// Pega essa chave e adiciona o novo valor passado no par�metro.
			values.set(index, value);
			
			// Retorna "false", pois a chave j� existia.
			return false;
		
		// Se a chave n�o existia, � executado esse la�o.
		} else {
			
			// Adiciona a chave a lista de chaves.
			keys.add(key);
			
			// Adiciona o valor a lista de valores.
			values.add(value);
			
			// Retorna "true", pois a chave n�o existia.
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
		 * Atribui a uma vari�vel a chave passada 
		 * como par�metro que est� no mapa.
		 */
		int index = getKeyIndex(key);
		
		// Se a chave passada como par�metro n�o existir, � retornado nulo.
		if (index < 0 ) {
			return null;
		}
		
		// Retorna o valor correspondente a chave passada como par�metro.
		return values.get(index);
	}
	
	/**
	 * Retorna o �ndice da lista para uma chave passada como par�metro.
	 * 
	 * @param key Chave que ser� procurada.
	 * @return �ndice da lista que corresponde a chave.
	 */
	private int getKeyIndex(K key) {
		
		// Procura a chave em toda a lista.
		for (int i = 0; i < keys.size(); i++) {
			K k = keys.get(i);
			
			/* 
			 * Se o �ndice da lista � igual a chave passada como par�metro,
			 * a chave � retornada.
			 */
			if (k.equals(key)) {
				return i;
			}
		}
		
		// Retornado se a chave n�o for encontrada.
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
