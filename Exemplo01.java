package aula09;

import java.util.ArrayList;
import java.lang.Iterable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Comparator;

class Exemplo01 {
	
	// Tabelas de espalhamento

	public static <T> void main(String[] args) {
		
		List<String> alunos2 = new ArrayList<>();
		alunos2.add("Adriel");
		alunos2.add("Ayrton");
		alunos2.add("Diogo");
		alunos2.add("Breno");
		System.out.println(alunos2);
		
		Set<String> alunos = new HashSet<String>();
		alunos.add("Adriel");
		alunos.add("Diogo");
		alunos.add("Ayrton");
		alunos.add("Breno");
		System.out.println(alunos);
		
		Map<String, Integer> alunos3 = new HashMap<>();
		alunos3.put("Adriel", 18);
		alunos3.put("Ayrton", 35);
		alunos3.put("Diogo", 22);
		alunos3.put("Breno", 23);
		System.out.println(alunos3);
				
		System.out.println("--------------"); 
		
		Map<Integer, String> listaOrdenada = new LinkedHashMap<>();
		
		alunos3.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> listaOrdenada.put(x.getValue(), x.getKey()));
		
		Set<Integer> keys = listaOrdenada.keySet();
		for (Integer key : keys) {
            System.out.println(key + " -- " + listaOrdenada.get(key));
        }
		
		System.out.println("--------------");
		
		System.out.println("Ordernado do > para o <: " + listaOrdenada);

	}

}


class alunos3 implements Comparable<alunos3>{

	private int alunos3;

	public int compareTo(alunos3 outroAluno) {
		if(this.alunos3 > outroAluno.getaluno3()) {
			return -1;
		} if (this.alunos3 < outroAluno.getaluno3()) {
			return 1;
		}
		// TODO Auto-generated method stub
		return 0;
	}

	private int getaluno3() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
