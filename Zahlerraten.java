import java.util.Random;
import java.util.Scanner;



public class Zahlerraten{
    public static void main(String[] args){
		boolean gameRestart = true; 
				
		while (gameRestart == true) {
				
		// Objekt "randomnumber" erstellen
		Random rnd = new Random();
				
		// Eine Nummer zwischen 1-100 generieren
		int rndNum = rnd.nextInt(100) + 1;
		boolean rndNumGuessed = false;
		long startTime = System.currentTimeMillis();
		int AnzVersuche = 0;
				
		System.out.println("Es wurde eine Zahl zwischen 1-100 ausgedacht... ");
		
			   
		
		while (rndNumGuessed == false) {
			AnzVersuche++;
			Scanner rndNumGuessSc = new Scanner(System.in);

					try {
						System.out.println("Erraten Sie die Zahl: ");
		
						int rndNumGuess = rndNumGuessSc.nextInt();
							
						if (rndNumGuess < rndNum) {
							System.out.println("Die geratene Zahl ist niedriger als die Geheimzahl!");
						}
						else if (rndNumGuess > 100) {
							System.out.println("Bitte geben Sie eine Zahl zwischen 1-100 ein...");
								if (AnzVersuche > 0) {
								AnzVersuche--;
							}
						}
						else if (rndNumGuess > rndNum) {
							System.out.println("Die geratene Zahl ist grösser als die Geheimzahl!");
						}
						else if (rndNumGuess == rndNum)
						{
							//geratene Zahl und Anz. Verusche werden angegeben
							System.out.println("Die Geheimzahl wurde erraten!");
							System.out.println("Total Versuche: " + AnzVersuche);
							rndNumGuessed = true;
							
							long stopTime = System.currentTimeMillis() - startTime;
							System.out.println("Sie haben " + stopTime / 1000 + " Sekunden gebraucht...");
								
								// Anfrage auf ein erneutes Spiel
							Scanner restartSc = new Scanner(System.in);
							System.out.println("Möchten Sie noch eine Runde spielen? y/n");
							String restart = restartSc.next();
							
							if (restart.equals("y") || restart.equals("Y"))
							{
								gameRestart = true;
							}
							else if (restart.equals("n") || restart.equals("N"))
							{
								gameRestart = false;
								System.out.println("Aufwiedersehen");
							}
							else
							{
								gameRestart = false;
								System.out.println("what");
							}      
						} 
					} 
					//Bei Fehleingabe wird dies ausgegeben
				catch (InputMismatchException e) {
					System.out.println("Bitte, geben Sie eine Zahl ein!");
										
					if (AnzVersuche > 0)
						{
							AnzVersuche--;
						}
					} 
				}           
			} 
		}
	}
     

