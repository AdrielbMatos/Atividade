package aula09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

class Escritor {
	
	public void gravarEmArquivo(Map<String, Integer> resultado) {
		try {
			FileWriter escritor = new FileWriter("resources/resultado.txt");

			for (String chave : resultado.keySet()) {
				String linha = chave + "," + resultado.get(chave) + "\n";
				escritor.write(linha);
			}
			escritor.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
