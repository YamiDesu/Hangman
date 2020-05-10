package HangmanPackage;

import java.util.Scanner;

public class Game {

	public static void startGame() {

		// Variablen & Stuff
		Scanner s = new Scanner(System.in);
		System.out.print("Player 2: Schau kurz weg! \nPlayer 1: Gib dein Wort (als Klein-Buchstaben) an, drück 'ENTER' und pass die Fenstergröße an: ");
		String wort = s.nextLine();
		char[] ausgabe = new char[wort.length()];
		int versuche = 10;
		boolean win = false;
		boolean pruefer = true;
		

		// Game-Grundeinstellung
		Methoden.leerzeile(20);
		Methoden.ersteAusgabe(wort, ausgabe);
		Strichmaennchen.create();

		//////////////////////// G A M E /////////////////////////////

		while( versuche > 0 && !win) {
			
			System.out.print("Die nächste Spielereingabe: ");
			String eingabe = s.nextLine();
			
			char raten = eingabe.charAt(0);

			pruefer = Methoden.checkWord(wort,raten,ausgabe,eingabe);

			if(pruefer == false)										
				versuche -- ;
			
			Methoden.leerzeile(20);
			
			Strichmaennchen.draw(versuche);
			
			System.out.println("restliche Versuche: " + versuche);

			win = Methoden.checkWin(ausgabe,wort);

			Methoden.zweiteAusgabe(ausgabe, wort);

		}

		Methoden.printWin(win); 
		
		s.close();
		
		

	}
	
}
