package tp2_fichiers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestCopy {

	public static void main(String[] args) {
		File inputFile = new File("D:\\fichiers\\in.txt");
		File outputFile = new File("D:\\fichiers\\out.txt");
		
		/*
		 * try { FileReader reader = new FileReader(inputFile); FileWriter writer = new
		 * FileWriter(outputFile); int caractere;
		 * 
		 * while ((caractere = reader.read()) != -1) { writer.write(caractere); }
		 * System.out.println("Copie terminée avec succès.");
		 * 
		 * reader.close(); writer.close(); } catch (IOException e) {
		 * e.printStackTrace();}
		 */
		
		
		/*
		 * try { BufferedReader bf = new BufferedReader(new
		 * FileReader("D:\\fichiers\\in.txt"));
		 * 
		 * String chaine; BufferedReader login = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedReader password = new
		 * BufferedReader(new InputStreamReader(System.in)); boolean
		 * authentificationReussie = false; try { String name=login.readLine(); String
		 * pwd=login.readLine(); login.close(); while ((chaine = bf.readLine()) != null)
		 * { String[] parts = chaine.split(" "); String loginFichier = parts[0]; String
		 * motDePasseFichier = parts[1];
		 * 
		 * if (name.equals(loginFichier) && pwd.equals(motDePasseFichier)) {
		 * authentificationReussie = true; break; } }} catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } if
		 * (authentificationReussie) { System.out.println("Authentification réussie"); }
		 * else { System.out.println("Erreur d'Authentification"); } } catch
		 * (FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
		/*
		 * try { BufferedReader bf = new BufferedReader(new
		 * FileReader("D:\\fichiers\\in.txt")); String caractere; int line=0; int nbC=0;
		 * int nbM=0; try { while ((caractere = bf.readLine()) != null) { line++; nbC+=
		 * caractere.length();
		 * 
		 * 
		 * StringTokenizer tokenizer = new StringTokenizer(caractere); nbM +=
		 * tokenizer.countTokens(); } bf.close();
		 * 
		 * System.out.println("Nombre de lignes : " + line);
		 * System.out.println("Nombre de mots : " + nbM);
		 * System.out.println("Nombre de caractères : " + nbC); } catch (IOException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
	        String cheminDestination = "D://fichiers//crypte1.txt";
	        String cheminSource = "D://fichiers//in.txt";
	        cryptage(cheminSource, cheminDestination);
		
		
		
	}
	
	public static  void cryptage(String cheminSource, String cheminDestination) {
	    try {
	        FileReader inputStream = new FileReader(cheminSource);
	        FileWriter outputStream = new FileWriter(cheminDestination);
	        
	        int caractere;
	        while ((caractere = inputStream.read()) != -1) {
	            caractere++;
	            outputStream.write(caractere);
	        }
	        
	        inputStream.close();
	        outputStream.close();
	        
	        System.out.println("Fichier crypté avec succès.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
}


