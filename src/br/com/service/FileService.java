package br.com.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileService {

	public static void main(String[] args) {
		
		Path caminho = Paths.get(System.getProperty("user.home"), "Downloads/nome_arquivo.csv ou txt");
		Stream<String> linhas;
		try {
			linhas = Files.lines(caminho);
			Stream<String> linesNotEmpty = removeLineEmpty(linhas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private static Stream<String> removeLineEmpty(Stream<String> linhas){
		return linhas.filter(horaSemanal -> !horaSemanal.isEmpty());
	}
	
	private static void processFile(Stream<String> linhas) {
		
		linhas.forEach(line -> {
			
			String messageIpBlocked = generateXmlFile(line);
 			
         	//new FileDAO().salvar(line, "Process with success!");
         	
         	System.out.println("\nDetail: " + line);
		});
	}

	private static String generateXmlFile(String line) {
		// TODO Auto-generated method stub
		return null;
	}
}
