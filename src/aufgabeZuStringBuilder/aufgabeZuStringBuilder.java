package aufgabeZuStringBuilder;

public class aufgabeZuStringBuilder {
	public static void main(String[] args) {
		{
			
			System.out.println("Aufgabe 1\n");
			
			StringBuilder sb = new StringBuilder("DiesX das ein");
											
			System.out.println(sb);
		
			sb.append(" super Beispiel");
			System.out.println(sb);
			// DiesX das ein super Beispiel
			// 01234567891111111111222222
			// 00000000000123456789012345
		
			sb.insert(13, " tollEs");
			System.out.println(sb);
			// DiesX das ein tollEs super Beispiel
			// 01234567891111111111222222
			// 00000000000123456789012345
		
			sb.deleteCharAt(4);
			System.out.println(sb);
			// Dies das ein tollEs super Beispiel
			// 01234567891111111111222222
			// 00000000000123456789012345
		
			sb.delete(19, 25);
			System.out.println(sb);
			// DiesX das ein tollEs Beispiel
			// 01234567891111111111222222
			// 00000000000123456789012345
		
			sb.setCharAt(17, 'e');
			System.out.println(sb);
			// Dies das ein tolles Beispiel
			// 01234567891111111111222222
			// 00000000000123456789012345
		
			sb.replace(5, 8, "ist");
			System.out.println(sb);
			// Dies ist ein tolles Beispiel
		}
		
		{
			System.out.println("Aufgabe 2\n");
			
			StringBuilder sb = new StringBuilder("Die Klasse 2910 beherrscht das Handling mit dem StringBuilder.");
												//012345678911111111112222222222222222222233333333334444444444555
												//000000000001234567890123456789012345678901234567890123456789012
			System.out.println(sb);
			System.out.println("Dieser String ist " + sb.length() + " Zeichen lang.");
			
			sb.insert(51, "nicht");
			System.out.println(sb);
			
		}
	}
}
