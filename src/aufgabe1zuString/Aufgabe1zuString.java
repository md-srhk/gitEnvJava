package aufgabe1zuString;
import java.util.Iterator;

public class Aufgabe1zuString {

	public static void main(String[] args) {
		
		String txt1 = "";
		System.out.println("Der String ist leer: " + txt1.isEmpty());
		
		txt1 = " ";
		System.out.println("er String ist leer: " + txt1.isEmpty());
		
		txt1 = txt1.trim();
		System.out.println("Der String ist leer: " + txt1.isEmpty());
		
		String txt2 = "Eine tolle Aufgabe";
		System.out.println("Das zehnte Zeichen lautet: " + txt2.charAt(9));
		System.out.println("Der String endet mit Aufgabe: " + txt2.endsWith("Aufgabe"));
		
		String meinString1;
		meinString1 = "Es ist November. Es regnet.";
		System.out.println(meinString1);
		
		String meinStringVorne = meinString1.substring(0, 15);
		String meinStringHinten = meinString1.substring(17, 27);
		
		System.out.println(meinStringVorne);
		System.out.println(meinStringHinten);
		
		int firstOccurence = meinString1.indexOf("e");
		int secondOccurence = firstOccurence + meinString1.substring(firstOccurence + 1).indexOf("e") + 1;
		System.out.print("Das erste e hat den Index "+firstOccurence);
		System.out.println(",das zweite e hat den Index " + secondOccurence);
		
		String meinString2 = "Hallo Schueler!";
		String meinString3 = "hallo schueler!";
		
		System.out.println("Die equals-Methode liefert: " + meinString3.equals(meinString2));
		System.out.println("Die equalsIgnoreCase-Methode liefert: " + meinString3.equalsIgnoreCase(meinString2));
		
		meinString2 = meinString2.toLowerCase();
		System.out.println("Die equals-Methode liefert jetzt: " + meinString3.equals(meinString2));
	}

}
