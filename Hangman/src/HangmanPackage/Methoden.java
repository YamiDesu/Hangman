package HangmanPackage;

public class Methoden {

	public static void ersteAusgabe(String a, char[] meep) {
		for (int i = 0; i < a.length() ; i++) {
			meep[i] = '_';
			System.out.print(meep[i] + " ");	
		}
		System.out.println(" ");
	}

	public static void zweiteAusgabe(char[] a, String b) {
		for (int i=0; i < b.length() ; i++) { 						
			System.out.print(a[i] + " ");	 
		}
		System.out.println(" ");
	}

	public static void leerzeile(int a) {
		for(int i=0; i< a; i++) {
			System.out.println(" ");
		}
	}

	public static boolean checkWord(String wort,char raten,char[] ausgabe,String eingabe) {
		boolean check = false;
		for (int i = 0; i < wort.length();i++) { 						
			if(raten == wort.charAt(i)) {
				ausgabe[i] = raten;
				check = true;
			} 
		}
		return check;
	}
	
	public static boolean checkWin(char[] a,String b) {
		for(int w = 0 ; w < b.length() ; w++) { 						
			if(a[w] == (b.charAt(w))) {
				if(w == b.length()-1) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}

	public static void printWin(boolean b) {
		System.out.println(" ");
		if(b==true) {
			System.out.println("You've W O N !");
			Trophy.draw();
		} else {
			System.out.println("You've L O S T !");
		}
	}

//String st = String.valueOf(wort.charAt(u));
//if(raten.equals(st)) {
	
}
