package aula09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Leitor {

	public Map<String, Integer> executarLeitura(String caminhoDoArquivo){
		
		Map<String, Integer> totalVotos = new HashMap<>();
		
		try {
			FileReader arquivo = new FileReader(caminhoDoArquivo);
			Scanner leitorDeLinhas = new Scanner(arquivo);
			
			leitorDeLinhas.useDelimiter("\n");
			
			while(leitorDeLinhas.hasNext()) {
				String linha = leitorDeLinhas.next();
				
				String[] valores = linha.split(",");
				
				String nome = valores[0];
				Integer votos = Integer.parseInt(valores[1]);
				
				if(totalVotos.get(nome) == null) {
					totalVotos.put(nome, votos);
				} else {
					Integer votosAtuais = totalVotos.get(nome);
					votos = votosAtuais + votos;
					totalVotos.put(nome, votos);
				}
			}
			
			leitorDeLinhas.close();
			
		} catch (FileNotFoundException erro) {
			erro.printStackTrace();
		}
		
		return totalVotos;
	}
}
