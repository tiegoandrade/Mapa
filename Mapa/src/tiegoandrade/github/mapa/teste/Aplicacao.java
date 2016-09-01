package tiegoandrade.github.mapa.teste;

import tiegoandrade.github.mapa.Map;

public class Aplicacao {
	
	public static void main(String[] args) {
	
	// Cria um Mapa com chaves inteiras e valores strings.
	Map<Integer, String> map = new Map<Integer, String>();
	
	// Insere os elementos no mapa.
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	map.put(4, "D");
	map.put(1, "X");
	
	// Imprime os elemetos do mapa.
	System.out.println(map.get(1));
	System.out.println(map.get(2));
	System.out.println(map.get(3));
	System.out.println(map.get(4));
	System.out.println(map.get(5));	
	}
}
