	package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String,Integer> list = new TreeMap<>();
		String path = "C:\\Users\\User\\OneDrive\\Imagens\\in.txt";
		
		try(BufferedReader bb = new BufferedReader(new FileReader(path))){
			String line = bb.readLine();
			while(line!=null) {
			String[] fields = line.split(",");
			String nome = fields[0];
			Integer voto = Integer.parseInt(fields[1]);
			
			if(list.containsKey(nome)) {
				int votar = list.get(nome);
				list.put(nome, voto+votar);
			}else {
				list.put(nome, voto);
			}
			
			line = bb.readLine();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(String x : list.keySet()) {
			System.out.println(x+" - "+list.get(x));
		}
		
		sc.close();
	}
}
